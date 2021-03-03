package com.example.taiji_demo1.Service;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserInfoServiceTest {

    @Autowired
    private  UserInfoService userInfoService;
    private Logger logger= LoggerFactory.getLogger(UserInfoServiceTest.class);

    @Test
    void addUsers() {
        
    }

    @Test
    void delete() {
    }

    @Test
    void update() {
    }

    @Test
    void find() {
    }

    @Test
    void findAll() {
    }



}
