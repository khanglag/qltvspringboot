/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.qltvspringboot.entity;

import javax.persistence.*;
import java.util.List;

/**
 *
 * @author MSII
 */
@Entity
@Table(name = "thietbi")
public class ThietBi {

    @Id
    @Column(name = "MaTB")
    private int MaTB;

     @OneToMany(fetch = FetchType.LAZY, mappedBy = "MaTB", cascade = CascadeType.ALL)
     private List<ThongTinSD> thongTinSDs;

    public ThietBi() {
    }

    public ThietBi(int MaTB, String TenTB, String MoTaTB) {
        this.MaTB = MaTB;
        this.TenTB = TenTB;
        this.MoTaTB = MoTaTB;
    }

    public String getTenTB() {
        return TenTB;
    }

    public void setTenTB(String tenTB) {
        TenTB = tenTB;
    }

    public int getMaTB() {
        return MaTB;
    }

    public void setMaTB(int maTB) {
        MaTB = maTB;
    }

    public String getMoTaTB() {
        return MoTaTB;
    }

    public void setMoTaTB(String moTaTB) {
        MoTaTB = moTaTB;
    }

    @Column(name = "TenTB")
    private String TenTB;

    @Column(name = "MoTaTB")
    private String MoTaTB;

    @Override
    public String toString() {
        return "{" +
                " MaTB='" + getMaTB() + "'" +
                ", TenTB='" + getTenTB() + "'" +
                ", MoTaTB='" + getMoTaTB() + "'" +
                "}";
    }

}
