package com.example.taiji_demo1.Service;
import com.example.taiji_demo1.dto.User;
import com.example.taiji_demo1.jpa.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoService  {

    @Autowired
    private UserRepository userRepository;

    private Logger logger= LoggerFactory.getLogger(UserInfoService.class);

//
//    @Value("${avatarPath}")
//    private  String avatar;
//
//    @Value("${userna}")
//    private  String username;
//
//    public void test() {
//        System.out.println("avatar="+avatar);
//        logger.info("username=,{}",username);
//        System.out.println("username:"+username);
//
//    }

//    public UserDTO addUser(UserDTO userDTO){
//
//        String user = JSONArray.toJSONString(userDTO);
//
//        logger.info("UserInfoService-getUserDTO，出参，添加用户成功，{}",user);
//        return userDTO;
//
//    }



    //添加用户
    public void  addUsers( User user){
        userRepository.save(user);
    }



    //根据id删除用户
    public void delete( Integer id){
        userRepository.deleteById(id);
    }




    //根据用户ID修改用户姓名
    public void  update( Integer id,String name){
        User user =  userRepository.findById(id).get();
        user.setName(name);
        userRepository.save(user);
    }



    //根据用户id查询用户信息
    public User find( Integer id){

        User user =  userRepository.findById(id).get();
        return user;
    }


    //查找所有用户

    public List<User> findAll( ){
        List<User> list =  userRepository.findAll();
        return list;
    }



}
