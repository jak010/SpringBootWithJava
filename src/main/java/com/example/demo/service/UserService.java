package com.example.demo.service;


import com.example.demo.model.UserVo;
import com.example.demo.repostiory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Iterable<UserVo> findALlUserInfo() {
        Iterable<UserVo> allUsers = userRepository.getUserInfoAll();
        return allUsers;
    }

    public void dummyInfo() {
        ServletUriComponentsBuilder.fromCurrentRequest().toUriString()
    }

    public void createUser(UserVo userVo) {
        System.out.println("userVo:: " + userVo.toString());
        userRepository.addUserInfo(userVo);
    }

    public Iterable<? extends UserVo> findByLikeUserName(String userName) {
        Iterable<UserVo> resultList = userRepository.findByUserNameLike(userName);
        return resultList;
    }

    public UserVo findByOneUserName(String userName) {
        UserVo userVO = userRepository.findByUserName(userName);
        return userVo;
    }

}
