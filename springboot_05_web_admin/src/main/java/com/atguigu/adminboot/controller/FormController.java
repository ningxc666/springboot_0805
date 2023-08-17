package com.atguigu.adminboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@Slf4j
public class FormController {

    @GetMapping("/form_layouts")
    public String fromTable(){
        return "form/form_layouts";
    }

    @PostMapping("/upload")
    public String fileUpload(@RequestParam("email") String email,
                             @RequestParam("username") String username,
                             @RequestPart("headerImg") MultipartFile headerImg,
                             @RequestPart("photos") MultipartFile[] photos) throws IOException {
        log.info("上传的信息：" + email, username, headerImg.getSize(), photos.length);
        if(!headerImg.isEmpty()){
            //获取文件的name属性值
            String originalFilename = headerImg.getOriginalFilename();
            //保存文件到服务器。
            headerImg.transferTo(new File("/Users/mac/Desktop/"+originalFilename));
        }
        if(photos.length > 0){
            for (MultipartFile photo : photos) {
                if(!photo.isEmpty()){
                    photo.transferTo(new File("/Users/mac/Desktop/"+photo.getOriginalFilename()));
                }
            }
        }
        return "main";
    }
}
