package com.jk.service.Impl;

import com.jk.dao.PhoneDao;
import com.jk.pojo.PhoneEntity;
import com.jk.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: zjt
 * @Title: PhoneServiceImpl
 * @ProjectName: springcloud_phone
 * @Description:
 * @date: 2021/5/13 19:39
 */
@Service
public class PhoneServiceImpl implements PhoneService {

    @Autowired
    private PhoneDao phoneDao;

    @Override
    public Map queryphone(int page, int rows, PhoneEntity phone) {
        int count=phoneDao.querycount(phone);
        int start=(page-1)*rows;
        List<PhoneEntity> list=phoneDao.queryphone(start,rows,phone);
        HashMap<String, Object> map = new HashMap<>();
        map.put("total",count);
        map.put("rows",list);
        return map;
    }

    @Override
    public void addphone(PhoneEntity phone) {
        if(phone.getId()!=null){
            phoneDao.updatephone(phone);
        }else{
            phoneDao.addphone(phone);
        }
    }

    @Override
    public void delphone(String ids) {
        String[] split = ids.split(",");
        for (String s : split) {
            phoneDao.delphone(s);
        }
    }

    @Override
    public PhoneEntity phonebyid(int id) {
        return phoneDao.phonebyid(id);
    }
}
