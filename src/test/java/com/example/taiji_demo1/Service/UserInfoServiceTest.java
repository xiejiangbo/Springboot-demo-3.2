package com.example.taiji_demo1.Service;


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
//    @Test
//    void getUserDTO() {
//        UserDTO userDTO=new UserDTO();
//        userDTO.setUserName("小明");
//        userDTO.setId(1);
//
//     UserDTO user =userInfoService.addUser(userDTO);
//
//
//        logger.info(" UserInfoServiceTest-getUserDTO,获取参数，用户名，{}",user.getUserName());
//
//    }


}
