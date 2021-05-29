package com.sunhongyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody

public class Hello {
    @RequestMapping("/")
    public String hello(){
        return "Hello!!";
    }
}
