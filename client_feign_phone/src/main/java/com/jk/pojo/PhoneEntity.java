package com.jk.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: zjt
 * @Title: PhoneEntity
 * @ProjectName: springcloud_phone
 * @Description:
 * @date: 2021/5/13 19:06
 */
@Data
public class PhoneEntity implements Serializable {

    private Integer id;
    private Integer ptype;
    private String pname;
    private String guige;
    private Integer price;
    private String createdate;


}
