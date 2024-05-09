package com.example.qltvspringboot.controllers.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.qltvspringboot.entity.ThanhVien;
import com.example.qltvspringboot.service.ThanhVienService;

@Controller
public class userController {

    @Autowired
    private ThanhVienService thanhVienService;

    @RequestMapping("/signin")
    public String signin() {
        return "View/signin";
    }

    @RequestMapping("/register")
    public String register() {
        return "View/register";
    }

    @PostMapping("/checkLogin")
    public String checkLogin(@RequestParam("mssv") String mssv,
            @RequestParam("password") String password) {
        System.out.println("================================================================");
        System.out.println("MSSV: " + mssv);
        System.out.println("Password: " + password);
        if (thanhVienService.checkLogin(mssv, password)) {
            return "View/user";
        }
        return "View/signin";
    }

    @GetMapping("/logout")
    public String logout() {
        return "View/signin";
    }
}
