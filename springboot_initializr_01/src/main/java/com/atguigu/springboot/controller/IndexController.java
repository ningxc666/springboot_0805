package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;
import javax.websocket.Session;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {
//    @RequestMapping("/")
//    public String getIndex(){
//        return "index.html";
//    }

     @RequestMapping(value = "/user/{id}/owner/{name}", method = RequestMethod.GET)
     public Map getUser(@PathVariable("id") Integer id,
                        @PathVariable("name") String name,
                        @PathVariable Map<String, String> pv,
                        @RequestParam("username") String username,
                        @RequestParam("password") String password,
                        @RequestParam Map<String,String> rq,
                        @RequestHeader("Accept-Language") String al,
                        @RequestHeader Map<String, String> rh){

         Map<String,Object> map = new HashMap<>();
//         map.put("id", id);
//         map.put("name", name);
//         map.put("pv", pv);
//         map.put("username", username);
//         map.put("password", password);
//         map.put("rq", rq);
         map.put("al", al);
         map.put("rh", rh);

         return map;
     }
     @RequestMapping(value = "/user", method = RequestMethod.POST)
     public Map saveUser(@RequestBody String rb){
         Map<String, Object> map = new HashMap<>();
         map.put("rb", rb);
         return map;
     }
     @RequestMapping(value = "/user", method = RequestMethod.DELETE)
     public String deleteUser(){
         return "delete user";
     }
     @RequestMapping(value = "/user", method = RequestMethod.PUT)
     public String updateUser(){
         return "update user";
     }

}
