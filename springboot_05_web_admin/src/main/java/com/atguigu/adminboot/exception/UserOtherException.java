package com.atguigu.adminboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN, reason = "请求次数过多")
public class UserOtherException extends RuntimeException{

    public UserOtherException(){}
    public UserOtherException(String message){
        super(message);
    }
}
