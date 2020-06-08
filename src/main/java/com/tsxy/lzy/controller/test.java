package com.tsxy.lzy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/test")
public class test {
    @RequestMapping("index")
    public String index() {
        return "user/test";
    }

    /**
     * 上传地址
     */
    @Value("${file.upload.path}")
    private String filePath;
    /**
     * 显示相对地址
     */
    @Value("${file.upload.path.relative}")
    private String fileRelativePath;

    @RequestMapping("upload")
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile file, Model model) {
        System.out.println("wojinru:file");
        // 获取上传文件名
        String filename = file.getOriginalFilename();
        // 定义上传文件保存路径
        String path = filePath + "rotPhoto/";
        // 新建文件
        File filepath = new File(path + filename);
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
        // 将src路径发送至html页面
        model.addAttribute("filename", "/images/rotPhoto/" + filename);
        return "user/test";
    }
}

