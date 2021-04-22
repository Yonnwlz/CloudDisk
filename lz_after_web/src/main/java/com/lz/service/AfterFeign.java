package com.lz.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "LZAFTERSERVICE")
public interface AfterFeign {

    @GetMapping("/test")
    public String getAll();
}
