package com.szdhc.controller.huangyushan;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/huangyushan")
@RestController
public class HelloController {
    @RequestMapping(value = "/hello.html")
    public String Hello(){
        return "hello spring boot";
    }
}
