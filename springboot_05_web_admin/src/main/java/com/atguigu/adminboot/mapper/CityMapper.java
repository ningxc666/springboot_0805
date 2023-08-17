package com.atguigu.adminboot.mapper;

import com.atguigu.adminboot.pojo.City;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

//@Mapper
public interface CityMapper {

    @Select("select * from city where id=#{id}")
    City getById(Integer id);

    @Insert("insert into city (name,state,country) values (#{name},#{state},#{country})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(City city);
}
