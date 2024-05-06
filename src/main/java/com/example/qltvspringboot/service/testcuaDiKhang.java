package com.example.qltvspringboot.service;

import com.example.qltvspringboot.entity.ThietBi;
import com.example.qltvspringboot.repository.ThietBiRepository;

public class testcuaDiKhang {
    public static void main(String[] args) {
        ThietBiService thietBiService=new ThietBiService();
        for(ThietBi temp:thietBiService.getAll()){
            System.out.println(temp.toString());
        }
    }
}
