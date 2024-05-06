/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.qltvspringboot.repository;

import java.util.List;
import java.util.Optional;

import com.example.qltvspringboot.entity.ThanhVien;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author MSII
 */
@Repository
public interface ThanhVienRepository extends CrudRepository<ThanhVien, Integer> {
    List<ThanhVien> findAllByMSSV(List<String> mssv);

    Optional<ThanhVien> findByMSSV(int id);
}
