/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ENTITY;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 *
 * @author 84837
 */
public class HoaDon {
    private String maHoaDon;
    private KhuyenMai khuyenMai;
    private NhanVien nhanVienLap;
    private KhachHang khachHang;
    private LocalDate ngayLap;
    private LocalDate ngayNhanPhong;
    private LocalDate ngayTraPhong;
    private int thue;
    private Double tienTraKhach;
    private Double tongTien;

    public HoaDon(String maHoaDon, KhuyenMai khuyenMai, NhanVien nhanVienLap, KhachHang khachHang, LocalDate ngayLap, LocalDate ngayNhanPhong, LocalDate ngayTraPhong, int thue, Double tienTraKhach, Double tongTien) {
        this.maHoaDon = maHoaDon;
        this.khuyenMai = khuyenMai;
        this.nhanVienLap = nhanVienLap;
        this.khachHang = khachHang;
        this.ngayLap = ngayLap;
        this.ngayNhanPhong = ngayNhanPhong;
        this.ngayTraPhong = ngayTraPhong;
        this.thue = thue;
        this.tienTraKhach = tienTraKhach;
        this.tongTien = tongTien;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public KhuyenMai getKhuyenMai() {
        return khuyenMai;
    }

    public void setKhuyenMai(KhuyenMai khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    public NhanVien getNhanVienLap() {
        return nhanVienLap;
    }

    public void setNhanVienLap(NhanVien nhanVienLap) {
        this.nhanVienLap = nhanVienLap;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public LocalDate getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(LocalDate ngayLap) {
        this.ngayLap = ngayLap;
    }

    public LocalDate getNgayNhanPhong() {
        return ngayNhanPhong;
    }

    public void setNgayNhanPhong(LocalDate ngayNhanPhong) {
        this.ngayNhanPhong = ngayNhanPhong;
    }

    public LocalDate getNgayTraPhong() {
        return ngayTraPhong;
    }

    public void setNgayTraPhong(LocalDate ngayTraPhong) {
        this.ngayTraPhong = ngayTraPhong;
    }

    public int getThue() {
        return thue;
    }

    public void setThue(int thue) {
        this.thue = thue;
    }

    public Double getTienTraKhach() {
        return tienTraKhach;
    }

    public void setTienTraKhach(Double tienTraKhach) {
        this.tienTraKhach = tienTraKhach;
    }

    public Double getTongTien() {
        return tongTien;
    }

    public void setTongTien(Double tongTien) {
        this.tongTien = tongTien;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maHoaDon);
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
        final HoaDon other = (HoaDon) obj;
        return Objects.equals(this.maHoaDon, other.maHoaDon);
    }
    
    

    @Override
    public String toString() {
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat dFormat = new DecimalFormat("#,###.##$");
        return "HoaDon{" + "maHoaDon=" + maHoaDon + ", khuyenMai=" + khuyenMai + ", nhanVienLap=" + nhanVienLap + ", khachHang=" + khachHang + ", ngayLap=" + ngayLap.format(formatter) + ", ngayNhanPhong=" + ngayNhanPhong.format(formatter) + ", ngayTraPhong=" + ngayTraPhong.format(formatter) + ", thue=" + thue + ", tienTraKhach=" + dFormat.format(this.tienTraKhach) + ", tongTien=" + dFormat.format(this.tongTien) + '}';
    }
    
    
}
