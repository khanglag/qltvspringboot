/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.qltvspringboot.service;

import java.util.List;
import com.example.qltvspringboot.entity.ThanhVien;
import com.example.qltvspringboot.repository.ThanhVienRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MSII
 */
@Service
public class ThanhVienService {

    @Autowired
    private ThanhVienRepository thanhVienRepository;

    public boolean checkLogin(String mssv, String password) {
        ThanhVien thanhVien = thanhVienRepository.findByMssvAndPassword(mssv, password);
        return thanhVien != null;
    }
}