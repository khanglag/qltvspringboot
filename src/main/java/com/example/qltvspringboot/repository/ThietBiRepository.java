/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.qltvspringboot.repository;

import com.example.qltvspringboot.entity.ThietBi;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author MSII
 */
public interface ThietBiRepository  extends  CrudRepository<ThietBi, Integer>{
    
}
