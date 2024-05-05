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
@Table(name = "thongtinsd")
public class ThongTinSD {
    @Id
    @Column(name = "MaTT")
    private Integer MaTT;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaTV")
    private ThanhVien MaTV;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaTB")
    private ThietBi MaTB;

    @Column(name = "TGVao")
    private LocalDateTime TGVao;

    @Column(name = "TGMuon")
    private LocalDateTime TGMuon;

    @Column(name = "TGTra")
    private LocalDateTime TGTra;

    public ThongTinSD() {
    }

    public ThongTinSD(Integer MaTT, ThanhVien MaTV, ThietBi MaTB, LocalDateTime TGVao, LocalDateTime TGMuon,
                      LocalDateTime TGTra) {
        this.MaTT = MaTT;
        this.MaTV = MaTV;
        this.MaTB = MaTB;
        this.TGVao = TGVao;
        this.TGMuon = TGMuon;
        this.TGTra = TGTra;
    }
    public Integer getMaTT() {
        return MaTT;
    }

    public void setMaTT(Integer maTT) {
        MaTT = maTT;
    }

    public LocalDateTime getTGVao() {
        return TGVao;
    }

    public void setTGVao(LocalDateTime TGVao) {
        this.TGVao = TGVao;
    }

    public LocalDateTime getTGMuon() {
        return TGMuon;
    }

    public void setTGMuon(LocalDateTime TGMuon) {
        this.TGMuon = TGMuon;
    }

    public LocalDateTime getTGTra() {
        return TGTra;
    }

    public void setTGTra(LocalDateTime TGTra) {
        this.TGTra = TGTra;
    }


    public Integer getMaTV() {
        return MaTV != null ? MaTV.getMaTV() : -1;
    }
    public Integer getMaTB() {
        return MaTB != null ? MaTB.getMaTB() : -1;
    }

    @Override
    public String toString() {
        return "{" +
                " MaTT='" + getMaTT() + "'" +
                ", MaTV='" + getMaTV() + "'" +
                ", MaTB='" + getMaTB() + "'" +
                ", TGVao='" + getTGVao() + "'" +
                ", TGMuon='" + getTGMuon() + "'" +
                ", TGTra='" + getTGTra() + "'" +
                "}";
    }

}