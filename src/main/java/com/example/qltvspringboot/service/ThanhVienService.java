/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.qltvspringboot.service;

import com.example.qltvspringboot.entity.ThanhVien;
import org.springframework.stereotype.Service;

/**
 *
 * @author MSII
 */
@Service
public interface ThanhVienService {
    Boolean checkMSSV(int mssv);

    Boolean checkPasswordThanhVien(int mssv, String password);

    ThanhVien getThanhVienByMSSV(int mssv);

    ThanhVien checkThanhVienByEmail(String Email);
}
