/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.qltvspringboot.service;

import java.util.List;
import com.example.qltvspringboot.entity.ThanhVien;
import java.util.Optional;

/**
 *
 * @author MSII
 */
public interface ThanhVienService {

    List<ThanhVien> findAllByMSSV(List<String> mssv);

    List<ThanhVien> findAll();

    Optional<ThanhVien> findByMSSV(int id);

    boolean checkLogin(String mssv, String password);

}
