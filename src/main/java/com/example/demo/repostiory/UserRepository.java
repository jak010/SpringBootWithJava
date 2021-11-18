package com.example.demo.repostiory;

import com.example.demo.model.UserEntity;
import com.example.demo.model.UserVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByUserName(@Param("userName") String userName);

    Iterable<UserVo> getUserInfoAll();

    void addUserInfo(UserVo userVo);

    Iterable<UserVo> findByUserNameLike(String userName);
}
