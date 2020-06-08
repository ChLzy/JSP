package com.tsxy.lzy.controller;

import com.tsxy.lzy.pojo.Admin;
import com.tsxy.lzy.service.adminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class adminController {
    @Autowired
    private adminService adminService;

    //验证login
    @RequestMapping("/login")
    @ResponseBody
    public Map<String, Boolean> sendString(Admin admin) {
        System.out.println("我进入了login+" + admin.toString() + "name：" + admin.getAdname() + "password:" + admin.getadpassword());
        HashMap<String, Boolean> map = new HashMap<>();
        Admin a = adminService.getByadname(admin.getAdname());
        if (a != null) {
            if (a.getadpassword().equals(admin.getadpassword())) {
                map.put("result", true);
            } else {
                map.put("result", false);
            }
        } else {
            map.put("result", false);
        }
        return map;
    }

    //遍历所有管理员信息
    @RequestMapping("/list")
    public String list(Model model, String curPage, String adname) {
        System.out.println("我已进入list");
        int curPage1 = curPage == null ? 1 : Integer.parseInt(curPage);
        adname = adname == null ? "" : adname;
        Map<String, Object> map = adminService.map(adname, curPage1);
        Object list = map.get("list");
        Object pageInfo = map.get("pageInfo");
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("adname", adname);
        model.addAttribute("adminlist", list);
        return "admin/admin-list";
    }

    //跳转到admin-add.html页面
    @RequestMapping("/add")
    public String add(Model model) {
        return "admin/admin-add";
    }

    //验证name是否存在
    @RequestMapping("/vaildname")
    @ResponseBody
    public Map<String, String> vaildname(Admin admin) {
        System.out.println("我进入vaildname：" + admin.getAdname());
        Admin a = adminService.getByadname(admin.getAdname());
        HashMap<String, String> map = new HashMap<>();
        if (a != null) {
            map.put("result", "已有此登录名，请重新输入");
        }
        return map;
    }

    @RequestMapping("/toAdd")
    public String toAdd(Model model, Admin admin) {
        System.out.println("我进入了toAdd&admin的值是：" + admin.toString());
        String s = adminService.adminAdd(admin);
        System.out.println("adminAdd:" + s);
        return "redirect:/admin/list";
    }

    @RequestMapping("/cate")
    public String cate(Model model) {
        return "/admin/admin-cate";
    }

    @RequestMapping("/del")
    public String del(Model model, Integer adid) {
        System.out.println("这是controller。del的adid：" + adid);
        String s = adminService.adminDel(adid);
        return "redirect:/admin/list";
    }

    @RequestMapping("/edit")
    public String edit(Model model, Integer adid) {
        System.out.println(adid);
        Admin admin = adminService.selectAdmin(adid);
        model.addAttribute("admin", admin);
        return "admin/admin-edit";
    }

    @RequestMapping("/toEdit")
    public String toEdit(Model model, Admin admin) {
        System.out.println("我已经进入toEdit:" + admin.toString());
        String s = adminService.edit(admin);
        System.out.println("toEdit:" + admin + s);
        return "redirect:/admin/list";
    }
}
