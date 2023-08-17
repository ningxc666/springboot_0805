package com.atguigu.springboot.controller;

import com.atguigu.springboot.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
public class ResponseController {

    @ResponseBody
    @GetMapping("/test/person")
    public Person testGetPerson(){
        Person person = new Person();
        person.setUsername("ningxc");
        person.setAnimal(Arrays.asList("dog","cat","pig"));
        person.setBirth(new Date());
        Set set = new HashSet();
        set.add(10000.0);
        set.add(10000.0);
        set.add(20000.0);
        person.setSalarys(set);

        return person;
    }
}
