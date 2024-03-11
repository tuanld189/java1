/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThiThu4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author tuani
 */
public class QLPT {

    ArrayList<PhuongTien> _lstPT;
    Scanner _sc = new Scanner(System.in);
    String _input;
    PhuongTien _PT;

    public QLPT() {
        _lstPT = new ArrayList<>();
        _PT = new PhuongTien();
    }

    public void menu() {
        int chon;
        do {
            System.out.println("=====MENU=====");
            System.out.println("1. Nhap danh sach doi tuong");
            System.out.println("2. Xuat danh sach doi tuong");
            System.out.println("3. Xuat danh sach cac phuong tien(tenQuocGia la viet nam)");
            System.out.println("4. Tim kiem bang maPT");
            System.out.println("5. Sap xep giam dan theo namSanXuat");
            System.out.println("6. Sua doi tuong");
            System.out.println("7. Xoa doi tuong");
            System.out.println("0. Thoat");
            System.out.println("================");
            System.out.println("Moi chon tu 1-7");
            chon = Integer.parseInt(_sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("Nhap danh sach doi tuong");
                    nhapDanhSach();
                    break;
                case 2:
                    System.out.println("Xuat danh sach doi tuong");
                    xuatDanhSach();
                    break;
                case 3:
                    System.out.println("Xuat danh sach cac phuong tien(tenQuocGia la viet nam)");
                    xuatDanhSachPTTheoQuocGia();
                    break;
                case 4:
                    System.out.println("Tim kiem bang maPT");
                    timKiem();
                    xuatDanhSach();
                    break;
                case 5:
                    System.out.println("Sap xep giam dan theo namSanXuat");
                    sapXep();
                    xuatDanhSach();
                    break;
                case 6:
                    System.out.println("Sua doi tuong");
                    suaDoiTuong();
                    xuatDanhSach();
                    break;
                case 7:
                    System.out.println("Xoa doi tuong");
                    xoaDoiTuong();
                    
                    break;
                case 0:
                    System.exit(chon);
                    break;
                default:
                    System.out.println("Moi nhap lai!!!");
            }

        } while (chon != 0);
    }

    public void nhapDanhSach() {
        String yesNo;
        do {

            _PT = new PhuongTien();

            _PT.nhapThongTin();

            _lstPT.add(_PT);
            System.out.println("Ban co muon nhap tiep khong(Y/N)?");
            yesNo = _sc.nextLine();
        } while (yesNo.equalsIgnoreCase("Y"));
    }

    public void xuatDanhSach() {
        for (PhuongTien phuongTien : _lstPT) {
            phuongTien.inThongTin();
        }
    }

    public void xuatDanhSachPTTheoQuocGia() {
        for (PhuongTien phuongTien : _lstPT) {
            if (phuongTien.getTenQuocGia().equalsIgnoreCase("viet nam")) {
                phuongTien.inThongTin();
            }
        }
    }

    public void timKiem() {
        System.out.println("Nhap id can tim= ");
        for (PhuongTien phuongTien : _lstPT) {
            if(phuongTien.getMaPT()==_sc.nextLine()){
                System.out.println(phuongTien.toString());
                return;
            }
        }System.out.println("Khong tim thay ma pt can tim");
        
    }
    public void sapXep(){
        Collections.sort(_lstPT, new Comparator<PhuongTien>() {
            @Override
            public int compare(PhuongTien o1, PhuongTien o2) {
                return o1.getNamSanXuat()<o2.getNamSanXuat()?1:-1;
            }
        });
    }
    public void xoaDoiTuong(){
        System.out.println("Moi nhap ma doi tuong can xoa: ");
        for (PhuongTien phuongTien : _lstPT) {
            if(phuongTien.getMaPT()==_sc.nextLine()){
                System.out.println(phuongTien.toString());
                _lstPT.remove(phuongTien);
            }
        }
    }
    public void suaDoiTuong(){
        System.out.println("Moi nhap ma can sua: ");
        _input=_sc.nextLine();
        for (int i = 0; i < _lstPT.size(); i++) {
            if(_lstPT.get(i).getMaPT()==_sc.nextLine()){
                System.out.println("Moi chon doi tuong can sua 1-4: ");
                System.out.println("1. Ma:");
                System.out.println("2. Ten:");
                System.out.println("3. Hang:");
                System.out.println("4. Nam:");
                int chon=Integer.parseInt(_sc.nextLine());
                switch (chon) {
                    case 1:
                        System.out.println("ma: ");
                        String ma=_sc.nextLine();
                        _lstPT.get(i).setMaPT(ma);
                        break;
                    case 2:
                        System.out.println("Ten: ");
                        String ten=_sc.nextLine();
                        _lstPT.get(i).setTenPT(ten);
                    case 3:
                        System.out.println("Hang: ");
                        String hang=_sc.nextLine();
                        _lstPT.get(i).setTenHangSanXuat(hang);
                    case 4:
                        System.out.println("Nam: ");
                        int nam=Integer.parseInt(_sc.nextLine());
                        _lstPT.get(nam).setNamSanXuat(nam);
                    default:
                        throw new AssertionError();
                }
                
            }
        }
    }
}
