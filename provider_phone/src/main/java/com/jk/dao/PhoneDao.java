package com.jk.dao;

import com.jk.pojo.PhoneEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: zjt
 * @Title: PhoneDao
 * @ProjectName: springcloud_phone
 * @Description:
 * @date: 2021/5/13 19:38
 */
@Mapper
@Repository
public interface PhoneDao {
    int querycount(@Param("phone") PhoneEntity phone);

    List<PhoneEntity> queryphone(@Param("start")int start, @Param("rows") int rows, @Param("phone")PhoneEntity phone);

    void addphone(PhoneEntity phone);

    void delphone(String s);

    PhoneEntity phonebyid(int id);

    void updatephone(PhoneEntity phone);
}
