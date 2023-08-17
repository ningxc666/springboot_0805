package com.atguigu.adminboot.service.impl;

import com.atguigu.adminboot.mapper.CityMapper;
import com.atguigu.adminboot.pojo.City;
import com.atguigu.adminboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    CityMapper cityMapper;
    public City getCityById(Integer id){
        return cityMapper.getById(id);
    }

    public void saveCity(City city) {
        cityMapper.insert(city);
    }
}
