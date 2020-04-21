package com.woniuxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by tianwenkai on 0:27 2020-04-21
 */
@Controller
public class ViewController {
    public ViewController() {
        System.out.println("ViewController.ViewController");
    }

    @GetMapping("/view/user")
        public String toUser() {
        System.out.println("hahahaha");
        return "user";  //  转发到 /templates/user.html
    }
}
