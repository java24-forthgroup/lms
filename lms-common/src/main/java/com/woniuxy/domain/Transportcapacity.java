package com.woniuxy.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by tianwenkai on 15:49 2020-04-21
 */

@Entity(name = "lms_capacity")
@Data
//运力类
public class Transportcapacity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer capacityid;
}
