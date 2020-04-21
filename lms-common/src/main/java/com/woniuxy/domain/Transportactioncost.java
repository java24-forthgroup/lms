package com.woniuxy.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by tianwenkai on 15:49 2020-04-21
 */

@Entity(name = "lms_cost")
@Data
//运输成本类
public class Transportactioncost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer costid;
}
