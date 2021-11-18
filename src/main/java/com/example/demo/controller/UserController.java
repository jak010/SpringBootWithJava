package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.model.UserVo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@RestController
public class UserController {

    private static List<User> userList = new ArrayList<User>();

    {
        userList.add(new User(1, "jpub01", "user01@test.com", "remine", new Date()));
        userList.add(new User(2, "jpub02", "user02@test.com", "restart", new Date()));
        userList.add(new User(3, "jpub03", "user03@test.com", "nine", new Date()));
        userList.add(new User(4, "jpub04", "user04@test.com", "namu", new Date()));
    }

    @RequestMapping("/user/{userNo}")
    public ResponseEntity<User> getUserInfo(@PathVariable int userNo) {
        User user = userList.get(userNo);
        return new ResponseEntity(user, HttpStatus.OK);
    }

    @RequestMapping("/user")
    public ResponseEntity<List<User>> getUserList() {
        HashMap<String, Object> resultList = new HashMap<>();
        resultList.put("result", userList);
        return new ResponseEntity(resultList, HttpStatus.OK);
    }

    @RequestMapping(value = "/user/regist", method = RequestMethod.POST)
    public ResponseEntity<?> registUser(@Validated @RequestBody UserVo uservo) {
        System.out.println("Controller vo check::" + uservo.toString());
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @RequestMapping("regist")
    public ResponseEntity<?> registerUser(@Validated @RequestBody UserVo userVo) {
        System.out.println("Controller vo check::" + userVo.toString());
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @RequestMapping("/{username}")
    public ResponseEntity<?> findByUserOne(@PathVariable("username") String userName){

        UserVo user = userService.

    }


}
