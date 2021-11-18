package com.example.demo.model;

import java.util.Date;

public class ApiErrorDetail {

    private String message;
    private int code;
    private Date timeStamp;

    public ApiErrorDetail() {

    }

    public ApiErrorDetail(String message, int code, Date timeStamp) {
        this.message = message;
        this.code = code;
        this.timeStamp = timeStamp;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }


}
