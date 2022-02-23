

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Long Bui
 */
public class HoaDon {
    private KhachHang khachHangMua;
    private SanPham sanPhamMua;
    private int soLuongMua;
    private String maKhMua;

    public HoaDon() {
    }

    public HoaDon(KhachHang khachHangMua, SanPham sanPhamMua, int soLuongMua) {
        this.khachHangMua = khachHangMua;
        this.sanPhamMua = sanPhamMua;
        this.soLuongMua = soLuongMua;
    }

    public KhachHang getKhachHangMua() {
        return khachHangMua;
    }

    public void setKhachHangMua(KhachHang khachHangMua) {
        this.khachHangMua = khachHangMua;
    }

    public SanPham getSanPhamMua() {
        return sanPhamMua;
    }

    public void setSanPhamMua(SanPham sanPhamMua) {
        this.sanPhamMua = sanPhamMua;
    }

    public int getSoLuongMua() {
        return soLuongMua;
    }

    public void setSoLuongMua(int soLuongMua) {
        this.soLuongMua = soLuongMua;
    }
    
    public int total() {
        return this.getSanPhamMua().getDonGia()*this.getSoLuongMua();
    }
    
    public void showBill() {
        System.out.println("San pham: "+this.getSanPhamMua().getTenSP());
        System.out.println("So luong: "+this.getSoLuongMua());
    }
}
