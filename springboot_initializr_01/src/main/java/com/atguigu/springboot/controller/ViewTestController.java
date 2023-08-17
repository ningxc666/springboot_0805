package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewTestController {

    @RequestMapping("/test/goto")
    public String testView(Model model){
        model.addAttribute("hello", "hello world");
        model.addAttribute("link","http://www.baidu.com");

        return "success";
    }
}
