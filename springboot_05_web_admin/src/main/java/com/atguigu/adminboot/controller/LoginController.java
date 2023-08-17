package com.atguigu.adminboot.controller;

import com.atguigu.adminboot.pojo.Account;
import com.atguigu.adminboot.pojo.City;
import com.atguigu.adminboot.pojo.User;
import com.atguigu.adminboot.service.AccountService;
import com.atguigu.adminboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    AccountService accountService;
    @Autowired
    CityService cityService;

    @GetMapping("/acct")
    @ResponseBody
    public Account getAcct(@RequestParam("id") Integer id){
        return accountService.getAcct(id);
    }
    @GetMapping("/city")
    @ResponseBody
    public City getCityById(@RequestParam("id") Integer id){
        return cityService.getCityById(id);
    }

    @PostMapping("/city")
    @ResponseBody
    public City insertCity(City city){
        cityService.saveCity(city);
        return city;
    }

    @GetMapping("/sql")
    @ResponseBody
    public String queryFromDb(){
        Long aLong = jdbcTemplate.queryForObject("select count(*) from account_tbl", Long.class);
        return aLong.toString();
    }

    @RequestMapping(value = {"/", "/login"})
    public String loginPage(){
        return "login";
    }

    @PostMapping("/login")
    public String toMain(User user, HttpSession session, Model model){
        if(StringUtils.hasLength(user.getUserName()) && "123456".equals(user.getPassword())){
            // 把登录的用户保存在session会话中
            session.setAttribute("loginUser", user);
            // 登录成功，重定向到main.html请求。重定向防止表单重复提交
            return "redirect:/main.html";
        }else{
            model.addAttribute("msg","账号密码错误");
            return "login";
        }
    }

    @GetMapping("/main.html")
    public String mainPage(HttpSession session, Model model){
        // 获取session会话中的"loginUser"，存在跳转到main页面，不存在则跳转到login页面
        Object loginUser = session.getAttribute("loginUser");
        if(loginUser != null){
            return "main";
        }else{
            model.addAttribute("msg", "请重新登录");
            return "login";
        }
        // 是否登录

    }
}
