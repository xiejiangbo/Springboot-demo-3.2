package com.example.taiji_demo1.controller;


import com.example.taiji_demo1.Service.UserInfoService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class HelloWorldController {
  private Logger log=LoggerFactory.getLogger(HelloWorldController.class);


@Autowired
private UserInfoService userInfoService;


@GetMapping("/index")
    public String index(){
    log.info("HelloWorldController-index-用于测试info日志");
    log.debug("HelloWorldController-index-用于测试debug日志");
    log.error("HelloWorldController-index-用于测试error日志");

    return  "helloworld---";
}

//    @GetMapping("/test")
//    public  void test(){
//    userInfoService.test();
//    }





}
