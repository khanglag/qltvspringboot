package com.example.qltvspringboot.service.Impl;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.qltvspringboot.entity.ThanhVien;
import com.example.qltvspringboot.repository.ThanhVienRepository;
import com.example.qltvspringboot.service.ThanhVienService;

public class ThanhVienServiceImpl implements ThanhVienService {

    @Autowired
    ThanhVienRepository thanhVienRepository;

    @Override
    public boolean checkLogin(String mssv, String password) {
        // TODO Auto-generated method stub
        Optional<ThanhVien> optionalThanhVien = findByMSSV(Integer.parseInt(mssv));
        if (optionalThanhVien.isPresent() && optionalThanhVien.get().getPassword().equals(password)) {
            return true;
        }
        return false;
    }

    @Override
    public List<ThanhVien> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<ThanhVien> findAllByMSSV(List<String> mssv) {
        return null;
    }

    @Override
    public Optional<ThanhVien> findByMSSV(int mssv) {
        // TODO Auto-generated method stub
        return thanhVienRepository.findByMSSV(mssv);
    }

}
