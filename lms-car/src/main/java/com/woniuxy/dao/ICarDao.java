package com.woniuxy.dao;


import com.woniuxy.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by tianwenkai on 0:28 2020-04-21
 */
public interface ICarDao extends JpaRepository<Car, Integer> {
}
