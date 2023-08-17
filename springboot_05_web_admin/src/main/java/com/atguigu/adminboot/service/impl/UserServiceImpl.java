package com.atguigu.adminboot.service.impl;

import com.atguigu.adminboot.mapper.UserMapper;
import com.atguigu.adminboot.pojo.User;
import com.atguigu.adminboot.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
