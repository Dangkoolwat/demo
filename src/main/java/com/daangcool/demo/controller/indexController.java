package com.daangcool.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {

    @RequestMapping({"/", ""})
    public String index() {

      return "hello from world";
    }
}
