package com.tsxy.lzy.controller;

import com.tsxy.lzy.pojo.Teacher;
import com.tsxy.lzy.service.teacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/teacher")
public class teacherController{
    /**上传地址*/
    @Value("${file.upload.path}")
    private String filePath;
    @Autowired
    private teacherService teaService;

    //遍历所有教师信息
    @RequestMapping("/list")
    public String list(Model model, String curPage, String teaname) {
        System.out.println("我已进入tealist");
        int curPage1 = curPage == null ? 1 : Integer.parseInt(curPage);
        teaname = teaname == null ? "" : teaname;
        Map<String, Object> map = teaService.map(teaname, curPage1);
        Object list = map.get("list");
        Object pageInfo = map.get("pageInfo");
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("teaname", teaname);
        model.addAttribute("teacherlist", list);
        return "teacher/teacher-list";
    }

    //跳转到teacher-add.html页面
    @RequestMapping("/add")
    public String add(Model model) {
        return "teacher/teacher-add";
    }

    //验证name是否存在
    @RequestMapping("/vaildname")
    @ResponseBody
    public Map<String, String> vaildname(Teacher teacher) {
        System.out.println("我进入vaildname：" + teacher.getTeaname());
        Teacher a = teaService.getByteaname(teacher.getTeaname());
        HashMap<String, String> map = new HashMap<>();
        if (a != null) {
            map.put("result", "已有此登录名，请重新输入");
        }
        return map;
    }

    @RequestMapping("/toAdd")
    public String toAdd(Model model, Teacher teacher, @RequestParam("photo") MultipartFile file) {
        System.out.println("我进入了toAdd&teacher的值是：" + teacher.toString());
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
        teacher.setTeaphoto("/images/rotPhoto/"+filename);
        String s = teaService.teacherAdd(teacher);
        System.out.println("photo："+teacher.getTeaphoto());
        System.out.println("teacherAdd:" + s);
        return "redirect:/teacher/list";
    }

    @RequestMapping("/cate")
    public String cate(Model model) {
        return "/teacher/teacher-cate";
    }

    @RequestMapping("/del")
    public String del(Model model, Integer teaid) {
        System.out.println("这是controller。del的teaid：" + teaid);
        String s = teaService.teacherDel(teaid);
        return "redirect:/teacher/list";
    }

    @RequestMapping("/edit")
    public String edit(Model model, Integer teaid) {
        System.out.println(teaid);
        Teacher teacher = teaService.selectTeacher(teaid);
        model.addAttribute("teacher", teacher);
        return "teacher/teacher-edit";
    }

    @RequestMapping("/toEdit")
    public String toEdit(Model model, Teacher teacher) {
        System.out.println("我已经进入toEdit:" + teacher.toString());
        String s = teaService.edit(teacher);
        System.out.println("toEdit:" + teacher + s);
        return "redirect:/teacher/list";
    }
}
