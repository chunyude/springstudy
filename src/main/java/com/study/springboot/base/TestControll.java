package com.study.springboot.base;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControll {

    @RequestMapping("/test")
    public String test(){
        return "brilliant！";
    }
}
