package com.woniuxy.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by tianwenkai on 18:46 2020-04-21
 */
@Entity(name = "lms_carqueue")
@Data
public class CarQueue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer carqueueid;

    @OneToMany(fetch = FetchType.LAZY,mappedBy ="carid")
    private Set<Car> carList = new HashSet<Car>();
    @OneToMany(fetch = FetchType.LAZY,mappedBy ="driverid")
    private Set<Driver> driverList = new HashSet<Driver>();;
    @OneToOne
    @JoinColumn(name = "taskid")
    private Hosttask hosttask;
}
