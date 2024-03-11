/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThiThu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author tuani
 */
public class QLCay {

    ArrayList<Cay> _lstCay;
    Scanner _sc = new Scanner(System.in);
    Cay _cay;
    String _input;

    public QLCay() {
        _lstCay = new ArrayList<>();
        _cay = new Cay();
    }

    public void menu() {
        int chon;
        do {
            System.out.println("=====Thong tin cay=====");
            System.out.println("1. Nhap danh sach doi tuong");
            System.out.println("2. Xuat danh sach doi tuong");
            System.out.println("3. Sap xep giam dan theo ID");
            System.out.println("4. Xoa doi tuong theo ID");
            System.out.println("0. Thoat");
            System.out.println("========================");
            System.out.println("Moi chon 1-4: ");
            chon = Integer.parseInt(_sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("1. Nhap danh sach doi tuong");
                    nhapDanhSach();
                    break;
                case 2:
                    System.out.println("2. Xuat danh sach doi tuong");
                    xuatDanhsach();
                    break;
                case 3:
                    System.out.println("3. Sap xep giam dan theo ID");
                    sapXep();
                    xuatDanhsach();
                    break;
                case 4:
                    System.out.println("4. Xoa doi tuong theo ID");
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

            _cay = new Cay();

            _cay.nhapThongTin();

            _lstCay.add(_cay);
            System.out.println("Ban co muon nhap tiep khong(Y/N) ?");
            yesNo = _sc.nextLine();
            
        } while (yesNo.equalsIgnoreCase("Y"));

    }

    public void xuatDanhsach() {
        for (Cay cay : _lstCay) {
            cay.inThongTin();
        }
    }
    public void sapXep(){
        System.out.println("Sap xep giam dan theo ID");
        Collections.sort(_lstCay, new Comparator<Cay>() {
            @Override
            public int compare(Cay o1, Cay o2) {
                return o1.getID()<o2.getID() ? 1:-1;
            }
        });
    }
    public void xoaDoiTuong(){
        System.out.println("Xoa doi tuong theo ID");
        _input=_sc.nextLine();
        for (int i = 0; i < _lstCay.size(); i++) {
            if(_lstCay.get(i).getID() == Integer.parseInt(_input)){
                System.out.println(_lstCay.get(i).toString());
                _lstCay.remove(i);
                return;
            }
        }
    }
    
}
