package com.woniuxy.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

/**
 * Created by tianwenkai on 0:02 2020-04-21
 */
@Entity(name = "lms_driver")
@Data
//司机类
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //driver主键
    private Integer driverid;
    //司机姓名
    private String drivername;
    //司机联系方式
    private String driverphone;
    //司机类型
    private String drivertype;
    @ManyToOne
    @JoinColumn(name="carqueueid")
    private Driver driver;

}
