package com.atguigu.springboot.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.util.UrlPathHelper;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class RequestAttributeController implements WebMvcConfigurer{
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        UrlPathHelper urlPathHelper = new UrlPathHelper();
        urlPathHelper.setRemoveSemicolonContent(false);
        configurer.setUrlPathHelper(urlPathHelper);
    }

    @RequestMapping("/goto")
    public String getRequestAttribute(HttpServletRequest request){
        request.setAttribute("msg", "yes");
        request.setAttribute("msg1", "no");
        return "success";
    }

    /**
    public WebMvcConfigurer webMvcConfigurer(){
        return new WebMvcConfigurer() {
            @Override
            public void configurePathMatch(PathMatchConfigurer configurer) {
                UrlPathHelper urlPathHelper = new UrlPathHelper();
                urlPathHelper.setRemoveSemicolonContent(false);
                configurer.setUrlPathHelper(urlPathHelper);
            }
        };
    }*/

    @ResponseBody
    @GetMapping("/cars/{values}")
    public Map<String, Object> getCarsInfo(@MatrixVariable("low") Integer low,
                                           @MatrixVariable("brand")List<String> brand,
                                           @PathVariable("values") String path){
        Map<String, Object> map = new HashMap<>();
        map.put("low", low);
        map.put("brand", brand);
        map.put("path", path);

        return map;
    }

    @ResponseBody
    @GetMapping("/boss/{boss}/{emps}")
    public Map<String, Object> getCarsInfo(@MatrixVariable(value = "age", pathVar = "boss") Integer boss_age,
                                           @MatrixVariable(value = "age", pathVar = "emps") Integer emp_age,
                                           @PathVariable("boss") String boss,
                                           @PathVariable("emps") String emps){
        Map<String, Object> map = new HashMap<>();
        map.put("boss_age", boss_age);
        map.put("emp_age", emp_age);
        map.put("boss_path", boss);
        map.put("emps_path", emps);
        return map;
    }
}
