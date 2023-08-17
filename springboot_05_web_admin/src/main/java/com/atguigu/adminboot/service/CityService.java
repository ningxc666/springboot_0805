package com.atguigu.adminboot.service;

import com.atguigu.adminboot.pojo.City;

public interface CityService {
    City getCityById(Integer id);
    void saveCity(City city);
}
