package com.woniuxy.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by tianwenkai on 0:04 2020-04-21
 */
@Entity(name = "lms_task")
@Data
//承运任务类
public class Hosttask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer taskid;
    //承运单号
    private long taskcode;
    private String goodsname;

    private String goodsweight;

    @OneToOne
    @JoinColumn(name = "carqueueid")
    private CarQueue carqueue;

}
