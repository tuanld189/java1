/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author tuani
 */
public class Bai_2_DanhSachSinhVien {

    ArrayList<Bai_2_SinhVienPoly> _lst = new ArrayList<>();

    public void nhap() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap ho ten sinh vien: ");
            String hoTen = sc.nextLine();
            if (hoTen == null || hoTen.equals("")) {
                break;
            }
            System.out.println("Nhap ten nganh (IT/Biz");
            String nganh = sc.nextLine();
            if (nganh.equalsIgnoreCase("IT")) {
                System.out.println("Nhap diem Java: ");
                double diemJava = sc.nextDouble();
                System.out.println("Nhap diem CSS: ");
                double diemCss = sc.nextDouble();
                System.out.println("Nhap diem HTML: ");
                double diemHtml = sc.nextDouble();
                Bai_2_SinhVienPoly newSV = new Bai_2_SinhVienIT(diemJava, diemCss, diemHtml, hoTen, nganh);
                _lst.add(newSV);
            } else if (nganh.equalsIgnoreCase("Biz")) {
                System.out.println("Nhap diem Marketting: ");
                double diemMarketting = sc.nextDouble();
                System.out.println("Nhap diem Sales: ");
                double diemSales = sc.nextDouble();
                Bai_2_SinhVienPoly newSV = new Bai_2_SinhVienBiz(diemMarketting, diemSales, hoTen, nganh);
                _lst.add(newSV);

            }

        } while (true);
    }

    public void xuat() {
        for (Bai_2_SinhVienPoly sv : _lst) {
            System.out.println("Ho ten: " + sv.getHoTen());
            System.out.println("Nganh: " + sv.getNganh());
            System.out.println("Diem TB: " + sv.getDiem());
            System.out.println("Hoc luc: " + sv.getHocLuc());
        }
    }

    public void xuatGioi() {
        for (Bai_2_SinhVienPoly sv : _lst) {
            if (sv.getHocLuc().equalsIgnoreCase("Gioi")) {
                System.out.println("Ho ten: " + sv.getHoTen());
                System.out.println("Nganh: " + sv.getNganh());
                System.out.println("Diem TB: " + sv.getDiem());
                System.out.println("Hoc luc: " + sv.getHocLuc());
            }
        }
    }
    Comparator<Bai_2_SinhVienPoly> _comp= new Comparator<Bai_2_SinhVienPoly>() {
        @Override
        public int compare(Bai_2_SinhVienPoly o1, Bai_2_SinhVienPoly o2) {
            return Double.compare(o1.getDiem(), o2.getDiem());
        }
    };
    public void sapXepTheoDiem(){
        Collections.sort(_lst, _comp);
        System.out.println("Sap xep theo diem: ");
        xuat();
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        int chon = 0;
        do {
            System.out.println("Menu chuong trinh");
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Xuat thong tin danh sach sinh vien");
            System.out.println("3. Xuat danh sach sinh vien co hoc luc gioi");
            System.out.println("4. Sap xep danh sach sinh vien theo diem");
            System.out.println("0. Thoat");
            System.out.println("Moi ban chon: ");
            chon = sc.nextInt();
            if (chon != 0) {
                switch (chon) {
                    case 0:
                        System.exit(chon);
                        break;
                    case 1:
                        nhap();
                        break;
                    case 2:
                        xuat();
                        break;
                    case 3:
                        xuatGioi();
                        break;
                    case 4:
                        nhap();
                        break;

                    default:
                        System.out.println("Nhap sai, nhap lai!");
                }
            }
        } while (true);

    }
}
