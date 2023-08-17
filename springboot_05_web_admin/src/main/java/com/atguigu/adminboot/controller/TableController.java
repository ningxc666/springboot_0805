package com.atguigu.adminboot.controller;

import com.atguigu.adminboot.pojo.User;
import com.atguigu.adminboot.service.UserService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;
import java.util.List;

@Controller
public class TableController {
    @Autowired
    UserService userService;

    @GetMapping("/basic_table")
    public String tableBasic(){

        return "table/basic_table";
    }

    @GetMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable("id") Integer id,
                             @RequestParam(value = "pn", defaultValue = "1") Integer pn,
                             RedirectAttributes ra){
        userService.removeById(id);
        ra.addAttribute("pn", pn);
        return "redirect:/dynamic_table";
    }

    @GetMapping("/dynamic_table")
    public String tableDynamic(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model){

//        List<User> users = Arrays.asList(new User("zhangsan", "123456"),
//                new User("lisi", "44444"),
//                new User("wangwu", "55555"),
//                new User("zhaoliu", "66666"));
        List<User> users = userService.list();
        Page<User> userPage = new Page<>(pn, 2);
        IPage<User> page = userService.page(userPage, null);
//        List<User> records = page.getRecords();
        model.addAttribute("users",page);
        return "table/dynamic_table";
    }
    @GetMapping("/editable_table")
    public String tableEditable(){

        return "table/editable_table";
    }
    @GetMapping("/pricing_table")
    public String tablePricing(){

        return "table/pricing_table";
    }
}
