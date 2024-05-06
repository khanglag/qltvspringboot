package com.example.qltvspringboot.controllers.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.qltvspringboot.entity.ThanhVien;
import com.example.qltvspringboot.service.ThanhVienService;

@Controller
public class userController {
    @Autowired
    ThanhVienService thanhVienService;

    @Autowired
    ThanhVien _thanhvienbean;

    @RequestMapping("/signin")
    public String Signin() {
        return "View/signin";
    }

    @RequestMapping("/register")
    public String Register() {
        return "View/register";
    }

    // @PostMapping("checkLogin")
    // public String checkLogin(@RequestParam("MSSV") int MSSV,
    // @RequestParam("Password") String password) {

    // if ((_thanhvienbean.getMaTV() == MSSV) &&
    // _thanhvienbean.getPassword().equals(password)) {
    // System.out.println("Login successful");
    // return "View/user";
    // }
    // return "View/sign";
    // }

    // @GetMapping("/signin")
    // public String logout() {
    // return "View/sign";
    // }
}
