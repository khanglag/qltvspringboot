/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.qltvspringboot.repository;

import com.example.qltvspringboot.entity.ThanhVien;

import java.util.List;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author MSII
 */
@Repository
@EnableJpaRepositories
public interface ThanhVienRepository extends CrudRepository<ThanhVien, Integer> {
    ThanhVien getThanhVienByMSSV(int mssv);

    ThanhVien findThanhVienByMSSV(int mssv);

    ThanhVien findThanhVienByEmail(String email);

    @Query(value = "select * from qlThanhVien", nativeQuery = true)
    List<ThanhVien> getAllThanhVien();
}
