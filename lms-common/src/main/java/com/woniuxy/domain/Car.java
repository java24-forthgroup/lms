package com.woniuxy.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * Created by tianwenkai on 0:01 2020-04-21
 */
@Entity(name = "lms_car")
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //car主键
    private Integer carid;
    //车牌号
    private String carcode;
    //车辆类型   大货车。。。。
    private String carmodel;
    //车辆承重
    private Integer carweight;

}
