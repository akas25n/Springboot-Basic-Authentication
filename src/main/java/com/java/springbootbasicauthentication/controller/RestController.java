package com.java.springbootbasicauthentication.controller;


import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping("/")
    public String greeting(){
        return "Your app is now secured!!";
    }
}
