package com.example.taiji_demo1.controller;
import com.example.taiji_demo1.Service.UserInfoService;
import com.example.taiji_demo1.dto.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {
    private Logger logger= LoggerFactory.getLogger(UserController.class);


    @Autowired
    private UserInfoService userInfoService;

//
//    @GetMapping("addUser")
//    public  void addUser(){
//        UserDTO userDTO=new UserDTO();
//        userDTO.setUserName("小明");
//        userDTO.setId(1);
//
//        userInfoService.addUser(userDTO);
//        logger.info("用户添加成功,用户信息为，{}",userDTO);
//
//    }

    //添加用户

    @RequestMapping("add")
    public String addUsers(){
        User user= new User("小B", 15);
         userInfoService.addUsers(user);
        System.out.println(user.toString());
        return user.toString()+ "添加成功";
    }


    //根据id删除用户
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        User user = userInfoService.find(id);
        userInfoService.delete(id);
        return user.toString() + "已经被删除";
    }



    //根据用户ID修改用户姓名
    @RequestMapping("/update/{id}/{name}")
    public String update(@PathVariable Integer id, @PathVariable String name){

        User user =  userInfoService.find(id);
        user.setName(name);
        userInfoService.update(id,name);
        return user.toString()+"修改成功";
    }

    //根据用户id查询用户信息

    @RequestMapping("/{id}")
    public String find(@PathVariable Integer id){
        User user =  userInfoService.find(id);
        return user.toString();
    }


    //查找所有用户
    @RequestMapping("/getAll")
    public String find( ){
        List<User> list =  userInfoService.findAll();
        return list.toString();
    }


}
