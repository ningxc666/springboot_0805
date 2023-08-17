package com.atguigu.adminboot.mapper;

import com.atguigu.adminboot.pojo.Account;
import org.apache.ibatis.annotations.Mapper;

//@Mapper
public interface AccountMapper {
    Account getAcct(Integer id);
}
