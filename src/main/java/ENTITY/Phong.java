/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ENTITY;

import java.util.Objects;

/**
 *
 * @author 84837
 */
public class Phong {
    private String maPhong;
    private LoaiPhong loaiPhong;
    private int soNguoi;
    private TrangThaiPhong trangThaiPhong;
    private TinhTrangPhong tinhTrangPhong;
    
    public Phong(){
    }

    public Phong(String maPhong, LoaiPhong loaiPhong, int soNguoi, TrangThaiPhong trangThaiPhong) {
        this.maPhong = maPhong;
        this.loaiPhong = loaiPhong;
        this.soNguoi = soNguoi;
        this.trangThaiPhong = trangThaiPhong;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public LoaiPhong getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(LoaiPhong loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public int getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }

    public TrangThaiPhong getTrangThaiPhong() {
        return trangThaiPhong;
    }

    public void setTrangThaiPhong(TrangThaiPhong trangThaiPhong) {
        this.trangThaiPhong = trangThaiPhong;
    }

    public TinhTrangPhong getTinhTrangPhong() {
        return tinhTrangPhong;
    }

    public void setTinhTrangPhong(TinhTrangPhong tinhTrangPhong) {
        this.tinhTrangPhong = tinhTrangPhong;
    }
    

    @Override
    public int hashCode() {
        return Objects.hash(maPhong);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Phong other = (Phong) obj;
        return Objects.equals(this.maPhong, other.maPhong);
    }

    @Override
    public String toString() {
        return "Phong{" + "maPhong=" + maPhong + ", loaiPhong=" + loaiPhong + ", soNguoi=" + soNguoi + ", trangThaiPhong=" + trangThaiPhong + ", tinhTrangPhong=" + tinhTrangPhong + '}';
    }  
}
