/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.qltvspringboot.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 *
 * @author MSII
 */
@Entity
@Table(name = "xuly")
public class XuLy {

    @Id
    @Column(name = "MaXL")
    private int MaXL;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaTV")
    private ThanhVien MaTV;

    @Column(name = "HinhThucXL")
    private String hinhThucXL;

    @Column(name = "SoTien")
    private Integer soTien;
    public XuLy() {
    }

    public XuLy(int MaXL, ThanhVien MaTV, String hinhThucXL, Integer soTien, LocalDateTime ngayXL,
                Integer trangThaiXL) {
        this.MaXL = MaXL;
        this.MaTV = MaTV;
        this.hinhThucXL = hinhThucXL;
        this.soTien = soTien;
        this.ngayXL = ngayXL;
        this.trangThaiXL = trangThaiXL;
    }

    public LocalDateTime getNgayXL() {
        return ngayXL;
    }

    public void setNgayXL(LocalDateTime ngayXL) {
        this.ngayXL = ngayXL;
    }

    public int getMaXL() {
        return MaXL;
    }

    public void setMaXL(int maXL) {
        MaXL = maXL;
    }

    public String getHinhThucXL() {
        return hinhThucXL;
    }

    public void setHinhThucXL(String hinhThucXL) {
        this.hinhThucXL = hinhThucXL;
    }

    public Integer getSoTien() {
        return soTien;
    }

    public void setSoTien(Integer soTien) {
        this.soTien = soTien;
    }

    public Integer getTrangThaiXL() {
        return trangThaiXL;
    }

    public void setTrangThaiXL(Integer trangThaiXL) {
        this.trangThaiXL = trangThaiXL;
    }

    @Column(name = "NgayXL")
    private LocalDateTime ngayXL;

    @Column(name = "TrangThaiXL")
    private Integer trangThaiXL;


    public int getMaTV() {
        return MaTV != null ? MaTV.getMaTV() : -1;
    }

    @Override
    public String toString() {
        return "{" +
                " MaXL='" + getMaXL() + "'" +
                ", MaTV='" + getMaTV() + "'" +
                ", HinhThucXL='" + getHinhThucXL() + "'" +
                ", SoTien='" + getSoTien() + "'" +
                ", NgayXL='" + getNgayXL() + "'" +
                ", TrangThaiXL='" + getTrangThaiXL() + "'" +
                "}";
    }
}
