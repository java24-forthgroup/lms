package com.woniuxy.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by tianwenkai on 0:05 2020-04-21
 */
@Entity(name = "lms_user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //主键 自增
    private Integer uid;
    //真实姓名
    private String truename;
    //用户名
    private String username;
    //密码
    private String password;
    //用户邮箱
    private String email;

}
