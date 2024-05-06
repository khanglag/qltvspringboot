package com.example.qltvspringboot.service;

import com.example.qltvspringboot.entity.ThietBi;
import com.example.qltvspringboot.repository.ThietBiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThietBiService {
    public ThietBiService(){};
    @Autowired
    private ThietBiRepository thietBiRepository;
    public ThietBi findByName(String name) {
        return thietBiRepository.findByName(name);
    }
    public List<ThietBi> getAll(){
        return thietBiRepository.findAllBy();
    }
    public long countTB(){
        return thietBiRepository.count();
    }
}
