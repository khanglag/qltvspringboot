package com.example.qltvspringboot.controllers.UserController;

import ch.qos.logback.core.model.Model;
import com.example.qltvspringboot.entity.ThanhVien;
import com.example.qltvspringboot.service.ThanhVienService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class userController {

    @Autowired
    private ThanhVienService thanhVienService;

    @Autowired
    private ThanhVien _ThanhVienBean;

    @RequestMapping("/signin")
    public String Signin() {
        return "View/signin";
    }

    @RequestMapping("/register")
    public String Register() {
        return "View/register";
    }

    @PostMapping("/checklogin")
    public String Login(@RequestParam("MSSV") int MSSV, @RequestParam("Password") String Password,
            Model model) {
        if (thanhVienService.checkMSSV(_ThanhVienBean.getMaTV()) == false) {
            return "redirect:/signin?mssvwrong";
        }
        if (thanhVienService.checkPasswordThanhVien(_ThanhVienBean.getMaTV(), _ThanhVienBean.getPassword())) {
            return "redierct:/home?success";
        }
        return "redirect:/signin?passwordwrong";
    }
}
