package com.atguigu.adminboot.servlet;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class MyRegistConfig {

//    @Bean
//    public ServletRegistrationBean myServlet(){
//        MyServlet myServlet = new MyServlet();
//        return new ServletRegistrationBean(myServlet, "/my","/my11");
//    }

//    @Bean
//    public FilterRegistrationBean myFilter(){
//        MyFilter myFilter = new MyFilter();
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(myFilter);
//        filterRegistrationBean.setUrlPatterns(Arrays.asList("/my","/css/*"));
//        return filterRegistrationBean;
//    }
    @Bean
    public ServletListenerRegistrationBean myListener(){
        MyListener myListener = new MyListener();
        return new ServletListenerRegistrationBean(myListener);
    }
}
