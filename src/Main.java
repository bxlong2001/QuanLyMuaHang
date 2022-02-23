
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<SanPham> listSP = new ArrayList<>();
        List<KhachHang> listKH = new ArrayList<>();
        List<HoaDon> listHD = new ArrayList<>();
        int n, m, k, h = 0;

        do {
            System.out.println("=====================");
            System.out.println("1. Quan ly san pham");
            System.out.println("2. Quan ly khach hang");
            System.out.println("3. Quan ly hoa don");
            System.out.println("0. Thoat");
            System.out.println("=====================");
            System.out.printf("Vui long chon: ");
            n = sc.nextInt();
            sc.nextLine();

            switch (n) {
                case 1:
                    do {
                        System.out.println("=====================");
                        System.out.println("1. Them san pham");
                        System.out.println("2. Danh sach san pham");
                        System.out.println("0. Thoat");
                        System.out.println("=====================");
                        System.out.printf("Vui long chon: ");
                        m = sc.nextInt();
                        sc.nextLine();

                        switch (m) {
                            case 1:
                                System.out.printf("Nhap ma sp: ");
                                String maSpMuonThem = sc.nextLine();
                                int flag = 0;
                                for (SanPham x : listSP) {
                                    if (x.getMaSP().equalsIgnoreCase(maSpMuonThem)) {
                                        System.out.printf("Nhap so luong them: ");
                                        x.setSoLuong(sc.nextInt());
                                        sc.nextLine();
                                        flag = 1;
                                        break;
                                    }

                                }
                                if (flag == 0) {
                                    SanPham sanPham = new SanPham();
                                    sanPham.setMaSP(maSpMuonThem);
                                    System.out.printf("Nhap ten sp: ");
                                    sanPham.setTenSP(sc.nextLine());
                                    System.out.printf("Nhap don gia: ");
                                    sanPham.setDonGia(sc.nextInt());
                                    sc.nextLine();
                                    System.out.printf("Nhap ngay san xuat: ");
                                    sanPham.setNgaySanXuat(sc.nextLine());
                                    System.out.printf("Nhap so luong: ");
                                    sanPham.setSoLuong(sc.nextInt());
                                    sc.nextLine();
                                    listSP.add(sanPham);
                                }
                                break;
                            case 2:
                                for (SanPham x : listSP) {
                                    x.xuatSanPham();
                                }
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Chon lai!");
                                break;
                        }
                    } while (m != 0);
                    break;
                case 2:
                    do {
                        System.out.println("=====================");
                        System.out.println("1. Them khach hang");
                        System.out.println("2. Sua tt khach hang");
                        System.out.println("3. Danh sach khach hang");
                        System.out.println("0. Thoat");
                        System.out.println("=====================");
                        System.out.printf("Vui long chon: ");
                        k = sc.nextInt();
                        sc.nextLine();

                        switch (k) {
                            case 1:
                                KhachHang khachHang = new KhachHang();
                                System.out.printf("Nhap ma KH: ");
                                khachHang.setMaKH(sc.nextLine());
                                System.out.printf("Nhap ten KH: ");
                                khachHang.setTenKH(sc.nextLine());
                                System.out.printf("Nhap nam sinh KH: ");
                                khachHang.setNamSinh(sc.nextInt());
                                sc.nextLine();
                                System.out.printf("Nhap dia chi: ");
                                khachHang.setDiaChi(sc.nextLine());
                                listKH.add(khachHang);
                                break;
                            case 2:
                                System.out.printf("Nhap ma KH muon sua tt: ");
                                String maKhMuonSua = sc.nextLine();
                                for (KhachHang x : listKH) {
                                    if (x.getMaKH().equalsIgnoreCase(maKhMuonSua)) {
                                        System.out.printf("Nhap ten KH muon sua: ");
                                        x.setTenKH(sc.nextLine());
                                        System.out.printf("Nhap nam sinh KH muon sua: ");
                                        x.setNamSinh(sc.nextInt());
                                        sc.nextLine();
                                        break;
                                    }
                                }
                                break;
                            case 3:
                                for (KhachHang x : listKH) {
                                    x.showInfo();
                                }
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Nhap sai!");
                        }
                    } while (k != 0);
                    break;
                case 3:
                    do {
                        System.out.println("=========================");
                        System.out.println("1. Mua hang");
                        System.out.println("2. Xem hoa don");
                        System.out.println("3. Sap xep");
                        System.out.println("0. Thoat");
                        System.out.println("========================");
                        System.out.printf("Vui long chon: ");
                        h = sc.nextInt();
                        sc.nextLine();

                        switch (h) {
                            case 1:
                                System.out.printf("Nhap ma KH muon mua: ");
                                String checkMaKH = sc.nextLine();
                                for (KhachHang x : listKH) {
                                    if (x.getMaKH().equalsIgnoreCase(checkMaKH)) {
                                        x.muaHang(listHD, listSP);
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                for (KhachHang x : listKH) {
                                    int total = 0;
                                    System.out.println("Hoa don cua khach hang " + x.getTenKH());
                                    for (HoaDon y : listHD) {
                                        if (x.getMaKH().equalsIgnoreCase(y.getKhachHangMua().getTenKH())) {
                                            y.showBill();
                                            total += y.total();
                                            x.setTotalMoney(total);
                                        }
                                    }
                                    System.out.println("=> Tong bill: " + x.getTotalMoney());
                                }
                                break;
                            case 3:
                                Collections.sort(listKH, new Comparator<KhachHang>() {
                                    @Override
                                    public int compare(KhachHang o1, KhachHang o2) {
                                        if(o1.getTotalMoney()>o2.getTotalMoney()) {
                                            return -1;
                                        }
                                        return 1;
                                    }
                                });
                                System.out.println("Da sap xep xong!");
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Nhap sai!");
                                break;
                        }
                    } while (h != 0);
                    break;
            }

        } while (n != 0);

    }
}
