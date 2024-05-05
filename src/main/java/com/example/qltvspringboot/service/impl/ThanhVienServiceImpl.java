/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.qltvspringboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.example.qltvspringboot.QltvspringbootApplication;
import com.example.qltvspringboot.entity.ThanhVien;
import com.example.qltvspringboot.repository.ThanhVienRepository;
import com.example.qltvspringboot.service.ThanhVienService;

/**
 *
 * @author khang
 */
@Service
public class ThanhVienServiceImpl implements ThanhVienService {
    @Autowired
    private ThanhVienRepository thanhVienRepository;

    @Override
    public Boolean checkMSSV(int mssv) {
        ThanhVien thanhVien = thanhVienRepository.findThanhVienByMSSV(mssv);
        if (thanhVien == null)
            return false;
        return true;
    }

    @Override
    public Boolean checkPasswordThanhVien(int mssv, String password) {
        ThanhVien thanhVien = thanhVienRepository.findThanhVienByMSSV(mssv);
        if (thanhVien.getPassword().equals(password))
            return true;
        return false;
    }

    @Override
    public ThanhVien getThanhVienByMSSV(int mssv) {
        return thanhVienRepository.getThanhVienByMSSV(mssv);
    }

    @Override
    public ThanhVien checkThanhVienByEmail(String Email) {
        return thanhVienRepository.findThanhVienByEmail(Email);
    }

}
