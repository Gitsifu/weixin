package com.sifu.weixin.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sifu on 2017/7/24
 *
 * @author sifu
 * @version 1.0.0
 */
@Slf4j
@RestController
public class Hello {
    @GetMapping("hello")
    public void hello(){

    }
}
