package com.atguigu.adminboot.service.impl;

import com.atguigu.adminboot.mapper.AccountMapper;
import com.atguigu.adminboot.pojo.Account;
import com.atguigu.adminboot.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    public Account getAcct(Integer id){
        return accountMapper.getAcct(id);
    }
}
