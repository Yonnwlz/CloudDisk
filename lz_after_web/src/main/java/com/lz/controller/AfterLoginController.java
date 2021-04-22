package com.lz.controller;

import com.lz.service.AfterFeign;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class AfterLoginController {
    @Autowired
    private AfterFeign afterFeign;

    @GetMapping("/hello")
    @ResponseBody
    public String getHello(){
        return afterFeign.getAll();
    }
}
