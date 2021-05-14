package com.jk.service;

import com.jk.pojo.PhoneEntity;

import java.util.Map;

/**
 * @author: zjt
 * @Title: PhoneService
 * @ProjectName: springcloud_phone
 * @Description:
 * @date: 2021/5/13 19:38
 */
public interface PhoneService {
    Map queryphone(int page, int rows, PhoneEntity phone);

    void addphone(PhoneEntity phone);

    void delphone(String ids);

    PhoneEntity phonebyid(int id);
}
