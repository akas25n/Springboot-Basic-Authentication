package com.java.springbootbasicauthentication.controller;


import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping("/index")
    public String greeting(){
        return "Welcome to the app. " +
                "Your app is secured";
    }

    @RequestMapping("/user")
    public String greetingUser(){
        return "You are an User!!";
    }

    @RequestMapping("/admin")
    public String greetingAdmin(){
        return "You are an Admin!!";
    }
}
