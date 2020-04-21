package com.woniuxy.dao;


import com.woniuxy.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by tianwenkai on 0:27 2020-04-21
 */
public interface IUserDao extends JpaRepository<User, Integer> {
}
