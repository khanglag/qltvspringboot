/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.qltvspringboot.entity;

import javax.persistence.*;
import java.util.List;

/**
 * @author MSII
 */
@Entity
@Table(name = "thanhvien")
public class ThanhVien {
    @Id
    @Column(name = "MaTV")
    private Integer MaTV;

     @OneToMany(fetch = FetchType.LAZY, mappedBy = "MaTV", cascade =
     CascadeType.ALL)
     private List<ThongTinSD> thongTinSDs;

     @OneToMany(fetch = FetchType.LAZY, mappedBy = "MaTV", cascade =
     CascadeType.ALL)
     private List<XuLy> xulies;

    @Column(name = "HoTen")
    private String HoTen;

    @Column(name = "Khoa")
    private String Khoa;

    @Column(name = "Nganh")
    private String Nganh;

    @Column(name = "SDT")
    private String SDT;

    @Column(name = "Password")
    private String Password;

    @Column(name = "Email")
    private String Email;

    public ThanhVien() {
    }

    public ThanhVien(Integer MaTV) {
        this.MaTV = MaTV;
    }

    public ThanhVien(Integer MaTV, String HoTen, String Khoa, String Nganh, String SDT, String Password, String Email) {
        this.MaTV = MaTV;
        this.HoTen = HoTen;
        this.Khoa = Khoa;
        this.Nganh = Nganh;
        this.SDT = SDT;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Integer getMaTV() {
        return MaTV;
    }

    public void setMaTV(Integer maTV) {
        MaTV = maTV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String khoa) {
        Khoa = khoa;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String nganh) {
        Nganh = nganh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "{" +
                " MaTV='" + getMaTV() + "'" +
                ", HoTen='" + getHoTen() + "'" +
                ", Khoa='" + getKhoa() + "'" +
                ", Nganh='" + getNganh() + "'" +
                ", SDT='" + getSDT() + "'" +
                "}";
    }
}
