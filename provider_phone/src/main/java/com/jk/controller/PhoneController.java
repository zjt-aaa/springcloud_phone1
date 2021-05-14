package com.jk.controller;

import com.jk.pojo.PhoneEntity;
import com.jk.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author: zjt
 * @Title: PhoneController
 * @ProjectName: springcloud_phone
 * @Description:
 * @date: 2021/5/13 19:38
 */
@RestController
@RequestMapping("phone")
public class PhoneController {

    @Autowired
    private PhoneService phoneService;

    @RequestMapping("queryphone")
    public Map queryphone(int page, int rows,@RequestBody PhoneEntity phone){
        return phoneService.queryphone(page,rows,phone);
    }

    @RequestMapping("addphone")
    public void addphone(@RequestBody PhoneEntity phone){
        phoneService.addphone(phone);
    }

    @RequestMapping("delphone")
    public void delphone(String ids){
        phoneService.delphone(ids);
    }

    @RequestMapping("phonebyid")
    public PhoneEntity phonebyid(int id){
        return phoneService.phonebyid(id);
    }


}
