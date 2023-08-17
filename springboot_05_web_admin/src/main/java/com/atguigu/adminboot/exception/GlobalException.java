package com.atguigu.adminboot.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler({ArithmeticException.class, NullPointerException.class}) //处理异常
    public String handlerArithException(){

        return "login";
    }
}
