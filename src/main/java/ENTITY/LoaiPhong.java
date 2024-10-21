/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ENTITY;

import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author 84837
 */
public class LoaiPhong {
    private String maLoaiPhong;
    private String tenLoaiPhong;
    private Double giaTien;
    
    public LoaiPhong(){
        this("", "", 0.0);
    }

    public LoaiPhong(String maLoaiPhong, String tenLoaiPhong, Double giaTien) {
        this.maLoaiPhong = maLoaiPhong;
        this.tenLoaiPhong = tenLoaiPhong;
        this.giaTien = giaTien;
    }

    public String getMaLoaiPhong() {
        return maLoaiPhong;
    }

    public void setMaLoaiPhong(String maLoaiPhong) {
        this.maLoaiPhong = maLoaiPhong;
    }

    public String getTenLoaiPhong() {
        return tenLoaiPhong;
    }

    public void setTenLoaiPhong(String tenLoaiPhong) {
        this.tenLoaiPhong = tenLoaiPhong;
    }

    public Double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(Double giaTien) {
        this.giaTien = giaTien;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat dFormat = new DecimalFormat("#,###.##$");
        return "LoaiPhong{" + "maLoaiPhong=" + maLoaiPhong + ", tenLoaiPhong=" + tenLoaiPhong + ", giaTien=" + dFormat.format(this.giaTien) + '}';
    }
    
    
}
