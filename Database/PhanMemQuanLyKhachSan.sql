create database PhanMemQuanLyKhachSan

use PhanMemQuanLyKhachSan

CREATE TABLE TaiKhoan (
    MaTaiKhoan NVARCHAR(50) PRIMARY KEY,
    TenDangNhap NVARCHAR(50),
    MatKhau NVARCHAR(50)
)

INSERT INTO TaiKhoan (MaTaiKhoan, TenDangNhap, MatKhau) VALUES (1, 'NV_QUANLY'), (2, 'NV_LETAN');

CREATE TABLE NhanVien (
    MaNhanVien NVARCHAR(6) PRIMARY KEY,
    TenNhanVien NVARCHAR(50),
    LoaiNhanVien NVARCHAR(50) NOT NULL,
    TaiKhoan NVARCHAR(50),
    NgaySinh DATE,
    CCCD NVARCHAR(12),
    SDT NVARCHAR(10),
    TrangThai BIT,
    FOREIGN KEY (TaiKhoan) REFERENCES TaiKhoan(MaTaiKhoan),
    CONSTRAINT chk_LoaiNhanVien CHECK (LoaiNhanVien IN ('NV_QUANLY', 'NV_LETAN')) -- Thêm ràng buộc CHECK
);