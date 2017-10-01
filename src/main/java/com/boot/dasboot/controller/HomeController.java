package com.boot.dasboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gkc on 30/09/2017.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Das Boot, reporting for duty!";
    }
}
