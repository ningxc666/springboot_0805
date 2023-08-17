package com.atguigu.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@Slf4j
public class HelloController {

    @RequestMapping("/hello2")
    @ResponseBody
    public String helloBoot(){
        log.info("发起一个hello请求");
        return "hello spring boot 2";
    }
}
