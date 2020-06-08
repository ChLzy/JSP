package com.tsxy.lzy.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.tsxy.lzy.pojo.Everyone;
import com.tsxy.lzy.pojo.SessionPojo;
import com.tsxy.lzy.pojo.Student;
import com.tsxy.lzy.pojo.Teacher;
import com.tsxy.lzy.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.*;
import java.io.File;
import java.io.IOException;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class userController {
    /**上传地址*/
    @Value("${file.upload.path}")
    private String filePath;
    @Autowired
    private userService userservice;

    @RequestMapping("/index")
    public String index(HttpServletRequest request,Model model) {
        return "user/index";
    }

    @RequestMapping("/test")
    public String test() {
        return "user/test";
    }
    @RequestMapping("/login")
    public String login(){
        return "user/login";
    }
    //退出登录
    @RequestMapping("/out")
    public String out(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.invalidate();
        System.out.println("session已销毁");
        return "redirect:/user/index";
    }
    @RequestMapping("/toIndex")
    public String toIndex(Model model, String account, String password, HttpServletResponse response, HttpSession session){
        System.out.println(account+":"+password);

            Everyone one = userservice.selectOne(account);
            //session
            SessionPojo sp=new SessionPojo();
            if (one.getType().equals("学生")){
                Student student = userservice.selectStu(account);
                sp.setMail(account);
                sp.setName(student.getStuname());
                sp.setPhoto(student.getStuphoto());
            }else if(one.getType().equals("教师")){
                Teacher teacher = userservice.selectTea(account);
                sp.setMail(account);
                sp.setName(teacher.getTeaname());
                sp.setPhoto(teacher.getTeaphoto());
            }
            session.setAttribute("sp",sp);
            return "redirect:/user/index";
    }
    //注册新账号
    @RequestMapping("/newAccount")
    public String newAccount(Model model, Everyone everyone,String pwd,String name){
        System.out.println(everyone.toString()+pwd);
        int i = userservice.newAccount(everyone);
        if(everyone.getType().equals("学生")){
            Student student = new Student();
            student.setStumail(everyone.getAccount());
            student.setStupassword(pwd);
            student.setStuphoto("/static/images/nickname.png");
            student.setStuname(name);
            int s = userservice.newStu(student);
            System.out.println("sssss"+s);
        }else {
            Teacher teacher = new Teacher();
            teacher.setTeamail(everyone.getAccount());
            teacher.setTeapassword(pwd);
            teacher.setTeaname(name);
            teacher.setTeaphoto("../../../static/images/nickname.png");
            int t = userservice.newTea(teacher);
            System.out.println("tttttt"+t);
        }
        System.out.println(i);
        return "redirect:/user/login";
    }
    //Ajax验证登录账号
    @RequestMapping("/vaildDl")
    @ResponseBody
    public String vaildDl(String acc,String pwd){
        System.out.println("vaildDl");
        Everyone everyone = userservice.selectOne(acc);
        String s="成功";
        if(everyone==null){
            s= "账号不存在";
        }else {
            if (everyone.getType().equals("学生")){
                Student student = userservice.selectStu(acc);
                if (!student.getStupassword().equals(pwd)){
                    s= "密码错误";
                }

            }else if(everyone.getType().equals("教师")){
                Teacher teacher = userservice.selectTea(acc);
                if (!teacher.getTeapassword().equals(acc)){
                    s="密码错误";
                }
            }
        }
        return s;
    }

    //进入个人信息界面
    @RequestMapping("/myMsg")
    public String myMsg(HttpServletRequest request,Model model){
        HttpSession session = request.getSession();
        SessionPojo sp = (SessionPojo)session.getAttribute("sp");
        Everyone everyone = userservice.selectOne(sp.getMail());
        if(everyone.getType().equals("学生")){
            Student student = userservice.selectStu(everyone.getAccount());
            model.addAttribute("student",student);
            return "user/myMsg";
        }else {
            Teacher teacher = userservice.selectTea(everyone.getAccount());
            model.addAttribute("teacher",teacher);
            return "user/myMsg2";
        }
    }

    //修改学生信息
    @RequestMapping("/stuEdit")
    public String stuEdit(Student student,Model model, @RequestParam("photo") MultipartFile file,HttpServletRequest request) {
        if(file!=null){
            //获取上传文件名
            String filename = file.getOriginalFilename();
            // 定义上传文件保存路径
            String path = filePath+"rotPhoto/";
            // 新建文件
            File filepath = new File(path, filename);
            // 判断路径是否存在，如果不存在就创建一个
            if (!filepath.getParentFile().exists()) {
                filepath.getParentFile().mkdirs();
            }
            try {
                // 写入文件
                file.transferTo(new File(path + File.separator + filename));
            } catch (IOException e) {
                e.printStackTrace();
            }
            student.setStuphoto("/images/rotPhoto/"+filename);
        }
        HttpSession session = request.getSession();
        SessionPojo sp = (SessionPojo) session.getAttribute("sp");
        Student stu = userservice.selectStu(sp.getMail());
        stu.setStuname(student.getStuname());
        stu.setStusex(student.getStusex());
        stu.setStuphoto(student.getStuphoto());
        sp.setMail(stu.getStumail());
        sp.setName(stu.getStuname());
        sp.setPhoto(stu.getStuphoto());
        int i = userservice.stuUpdate(stu);
        System.out.println("photo："+student.getStuphoto());
        System.out.println("teacherAdd:" + i);
        return "redirect:/user/index";
    }


}
