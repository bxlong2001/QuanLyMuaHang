/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Long Bui
 */
public class SanPham {
    private String maSP;
    private String tenSP;
    private int donGia;
    private String ngaySanXuat;
    private int soLuong;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, int donGia, String ngaySanXuat, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.ngaySanXuat = ngaySanXuat;
        this.soLuong = soLuong;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public String getNgaySanXuat() {
        return ngaySanXuat;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong += soLuong;
    }
    
    public void setNgaySanXuat(String ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }
    
    public void xuatSanPham(){
        System.out.println("=================================");
        System.out.println("Ma SP: "+getMaSP());
        System.out.println("Ten SP: "+getTenSP());
        System.out.println("Don gia: "+getDonGia());
        System.out.println("Ngay san xuat: "+getNgaySanXuat());
        System.out.println("So luong: "+getSoLuong());
    }
}
