/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ENTITY;

/**
 *
 * @author 84837
 */
public enum LoaiNhanVien {
    NV_QUANLY("Nhan vien quan ly"), NV_LETAN("Nhan vien le tan");
     
    private String loaiNhanVien;

    LoaiNhanVien(String loaiNhanVien) {
        this.loaiNhanVien = loaiNhanVien;
    }

    @Override
    public String toString() {
        return "loaiNhanVien{" + "ordinal=" + ordinal() + ", name=" + name() + ", loaiNhanVien=" + loaiNhanVien + '}';
    }
}
