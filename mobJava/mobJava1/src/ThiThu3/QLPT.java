/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThiThu3;

import java.util.ArrayList;
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
    PhuongTien _PT;
    String _input;

    public QLPT() {
        _lstPT = new ArrayList<>();
        _PT = new PhuongTien();
    }

    public void menu() {
        int chon;
        do {
            System.out.println("=======MENU=======");
            System.out.println("1. Nhap danh sach doi tuong. ");
            System.out.println("2. Xuat danh sach doi tuong. ");
            System.out.println("3. Xuat danh sach cac phuong tien (tenQuocGia la VietNam). ");
            System.out.println("4. Sap xep giam dan theo nam san xuat. ");
            System.out.println("===================");
            System.out.println("Moi chon 1-4: ");
            chon = Integer.parseInt(_sc.nextLine());
            switch (chon) {
            case 1:
                System.out.println("1. Nhap danh sach doi tuong. ");
                nhapDanhSach();
                break;
            case 2:
                System.out.println("2. Xuat danh sach doi tuong. ");
                xuatDanhSach();
                break;
            case 3:
                System.out.println("3. Xuat danh sach cac phuong tien (tenQuocGia la VietNam). ");
                xuatDSPTLaVietNam();
                break;
            case 4:
                System.out.println("4. Sap xep giam dan theo nam san xuat. ");
                break;
            case 0:
                System.exit(chon);
                break;
            default:
                throw new AssertionError();
        }
        } while (chon != 0);
        
    }
    
    public void nhapDanhSach(){
       String yesNo;
        do {
            _PT=new PhuongTien();
            
            _PT.nhapThongTin();
            
            _lstPT.add(_PT);
            
            System.out.println("Ban co muon tiep tuc khong(Y/N)");
            yesNo=_sc.nextLine();
        } while (yesNo.equalsIgnoreCase("Y"));
    }
    
    public void xuatDanhSach(){
        for (PhuongTien phuongTien : _lstPT) {
            phuongTien.inThongTin();
        }
    }
    public void xuatDSPTLaVietNam(){
        System.out.println("Danh sach cac phuong tien (tenQuocGia la VietNam): ");
        for (PhuongTien phuongTien : _lstPT) {
            if(phuongTien.getTenQuocGia().equalsIgnoreCase("viet nam")){
                phuongTien.inThongTin();
            }
        }
    }
    
    public void sapXepTheoNamSanXuat(){
        System.out.println("Sap xep theo nam san xuat: ");
        Collections.sort(_lstPT, new Comparator<PhuongTien>() {
            @Override
            public int compare(PhuongTien o1, PhuongTien o2) {
                return o1.getNamSanXuat()<o1.getNamSanXuat()?1:-1;
            }
        });
    }
}
