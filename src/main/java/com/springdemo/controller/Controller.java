package com.springdemo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class Controller {

    @GetMapping("/add-data")
    public String add(){
        return "Data saved to database successfully.";
    }

    @DeleteMapping("/delete-data")
    public String delete(){
        return "Data deleted from database successfully.";
    }
}



