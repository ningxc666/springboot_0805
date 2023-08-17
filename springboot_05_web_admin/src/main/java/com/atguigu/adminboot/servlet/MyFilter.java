package com.atguigu.adminboot.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@Slf4j
//@WebFilter
//public class MyFilter implements Filter {
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        Filter.super.init(filterConfig);
//        log.info("myFilter初始化");
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        log.info("myFilter工作");
//    }
//
//    @Override
//    public void destroy() {
//        Filter.super.destroy();
//        log.info("myFilter销毁");
//    }
//}
