
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Long Bui
 */
public class KhachHang {

    public String maKH;
    private String tenKH;
    private int namSinh;
    private String diaChi;
    private int totalMoney;

    public KhachHang() {
    }

    public KhachHang(String maKH, String tenKH, int namSinh, String diaChi) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }
    
    public void muaHang(List<HoaDon> listHD, List<SanPham> listSP) {
        Scanner sc = new Scanner(System.in);
        HoaDon hoaDon = new HoaDon();
        hoaDon.setKhachHangMua(this);
        System.out.println("San pham muon mua: ");
        String checkMaSP = sc.nextLine();
        for(SanPham x: listSP) {
            if(x.getMaSP().equalsIgnoreCase(checkMaSP)){
                hoaDon.setSanPhamMua(x);
                System.out.println("Nhap so luong mua: ");
                hoaDon.setSoLuongMua(sc.nextInt());
                sc.nextLine();
                listHD.add(hoaDon);
                break;
            }
        }
    }

    public void showInfo() {
        System.out.println("===========================");
        System.out.println("Ma KH: " + this.getMaKH());
        System.out.println("Ten KH: " + this.getTenKH());
        System.out.println("Nam sinh: " + this.getNamSinh());
        System.out.println("Dia chi: " + this.getDiaChi());
    }
}
