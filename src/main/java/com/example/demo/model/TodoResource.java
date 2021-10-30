package com.example.demo.model;

import org.springframework.hateoas.RepresentationModel;

public class TodoResource extends RepresentationModel<TodoResource> {

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;

    public TodoResource() {
    }

    public TodoResource(String title) {
        this.title = title;
    }


}
