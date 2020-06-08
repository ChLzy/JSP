package com.tsxy.lzy.controller;

import com.tsxy.lzy.pojo.Notice;
import com.tsxy.lzy.service.dataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/data")
public class dataController {
    @Autowired
    private dataService dataService;

    /*公告通知*/
    @RequestMapping("/notice")
    public String notice() {
        return "redirect:/data/noticeList";
    }

    /*添加公告页面*/
    @RequestMapping("/toNotice")
    public String toNotice() {
        return "data/notice-add";
    }

    /*添加公告*/
    @RequestMapping("/addNotice")
    public String addNotice(Notice notice, Model model) {
        if (notice.getState() == null) {
            notice.setState("OFF");
        }
        System.out.println(model.toString());
        String s = dataService.addNotice(notice);
        System.out.println(s);
        return "redirect:/data/noticeList";
    }

    /*遍历公告*/
    @RequestMapping("/noticeList")
    public String noticeList(Model model, String curPage, String title) {
        int curPage1 = curPage == null ? 1 : Integer.parseInt(curPage);
        title = title == null ? "" : title;
        Map<String, Object> map = dataService.map(title, curPage1);
        Object list = map.get("list");
        Object pageInfo = map.get("pageInfo");
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("title", title);
        model.addAttribute("notices", list);
        return "data/notice-list";
    }
    /*ajax显示公告*/
    @RequestMapping("/show")
    @ResponseBody
    public List show(HttpServletRequest request, HttpServletResponse response){
        List<Notice> notices = dataService.allNotice();
        Notice notice = notices.get(notices.size() - 1);
        String title = notice.getTitle();
        String content = notice.getContent();
        List<String> list=new ArrayList<>();
        list.add(title);
        list.add(content);
        return list;
    }
    /*删除公告*/
    @RequestMapping("/delNotice")
    public String delNotice(Model model,Integer id){
        int i = dataService.delNotice(id);
        System.out.println("delNotice:"+i);
        return "redirect:/data/noticeList";
    }
}
