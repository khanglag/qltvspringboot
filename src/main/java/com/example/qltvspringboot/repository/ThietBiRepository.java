/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.qltvspringboot.repository;

import com.example.qltvspringboot.entity.ThietBi;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


/**
 *
 * @author MSII
 */
public interface ThietBiRepository  extends  CrudRepository<ThietBi, Long>{
    public ThietBi findByName(String name);
    public List<ThietBi> findAllBy();
    public long count();
}
