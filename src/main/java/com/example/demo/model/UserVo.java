package com.example.demo.model;

import javax.validation.constraints.NotNull;
import java.io.Serializable;


public class UserVo implements Serializable {


    private String id;
    @NotNull(message = "userName field is null")
    private String username;
    private String email;

    public UserVo() {

    }

    public UserVo(String id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
