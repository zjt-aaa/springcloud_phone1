package com.jk.service;

import com.jk.pojo.PhoneEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author: zjt
 * @Title: PhoneService
 * @ProjectName: springcloud_phone
 * @Description:
 * @date: 2021/5/13 19:06
 */
@FeignClient(value = "provider")
public interface PhoneService {

    @RequestMapping("phone/queryphone")
    Map queryphone(@RequestParam int page,@RequestParam int rows, PhoneEntity phone);

    @RequestMapping("phone/addphone")
    void addphone(PhoneEntity phone);

    @RequestMapping("phone/delphone")
    void delphone(@RequestParam String ids);

    @RequestMapping("phone/phonebyid")
    PhoneEntity phonebyid(@RequestParam int id);
}
