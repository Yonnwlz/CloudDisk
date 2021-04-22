package com.lz.controller;

import com.lz.service.AfterLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyCont {
    @Autowired
    private AfterLoginService afterLoginService;

    @GetMapping("/test")
    @ResponseBody
    public List getTest(){
        return afterLoginService.getAll();
    }
}
