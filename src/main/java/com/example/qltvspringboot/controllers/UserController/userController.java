package com.example.qltvspringboot.controllers.UserController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class userController {

    @RequestMapping("/signin")
    public String Signin() {
        return "View/signin";
    }

    @RequestMapping("/register")
    public String Register() {
        return "View/register";
    }
}
