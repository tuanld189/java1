/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_6_BaiTap_OOP_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tuani
 */
public class QLNYC {

    //biến toàn cục đặt trên cùng => dấu _
    List<NguoiYeuCu> _lstNYC;
    Scanner _sc = new Scanner(System.in);
    NguoiYeuCu _nguoiYeuCu;

    public QLNYC() {
        _lstNYC = new ArrayList<>();
        fakeData();// Tạo sẳn dữ liêu cho danh sách
    }

    public void nhapDanhSachNYC() {
        //1. Đối tượng
        System.out.println("Nhap so luong Nguoi Yeu Cu: ");
        int soLuong = Integer.parseInt(_sc.nextLine());
        //for +tab
        for (int i = 0; i < soLuong; i++) {
            _nguoiYeuCu = new NguoiYeuCu(); //khởi tạo đối tượng
            //2. Nhập thông tin cho đối tượng
            System.out.println("Nhap ma NYC: ");//yêu cầu ng dùng nhập vào
            String maNY = _sc.nextLine();// lấy giá trị từ bàn phím
            _nguoiYeuCu.setMaNY(maNY);//gán giá trị
            System.out.println("Nhap ho ten: ");//họ tên
            String hoTen = _sc.nextLine();
            _nguoiYeuCu.setHoTen(hoTen);
            System.out.println("Nhap nam sinh: ");//năm sinh
            int namSinh = Integer.parseInt(_sc.nextLine());
            _nguoiYeuCu.setNamSinh(namSinh);
            System.out.println("Nhap so do vong 1: ");//số đo vòng 1
            double vong1 = Double.parseDouble(_sc.nextLine());
            _nguoiYeuCu.setVong1(vong1);
            System.out.println("Nhap so do vong 2: ");//số đo vòng 2
            double vong2 = Double.parseDouble(_sc.nextLine());
            _nguoiYeuCu.setVong2(vong2);
            System.out.println("Nhap so do vong 3: ");//số đo vòng 3
            double vong3 = Double.parseDouble(_sc.nextLine());
            _nguoiYeuCu.setVong3(vong3);

            //3. Thêm vào danh sách
            _lstNYC.add(_nguoiYeuCu);
        }
        //Alt+ shift+ F : format code
    }

    public void xuatDanhSachNYC() {
        //fore + tab
        for (NguoiYeuCu nguoiYeuCu : _lstNYC) {
            System.out.println("Danh sanh NYC: ");
            System.out.println(nguoiYeuCu.toString());
            //nguoiYeuCu.inThongTin();
        }
    }

    public void timNYC() {
        System.out.println("Nhap ma NYC can tim: ");
        String input = _sc.nextLine();
        int count = 0;
        for (int i = 0; i < _lstNYC.size(); i++) {
            if (_lstNYC.get(i).getMaNY().equalsIgnoreCase(input)) {
                System.out.println("Thong tin NYC can tim la: ");
                System.out.println(_lstNYC.get(i).getMaNY());
                System.out.println(_lstNYC.get(i).toString());
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Khong xoa duoc NYC!");

        }
    }

    public void xoaNYC() {
        System.out.println("Nhap ma NYC can xoa: ");
        String input = _sc.nextLine();
        int count = 0;
        for (int i = 0; i < _lstNYC.size(); i++) {
            if (_lstNYC.get(i).getMaNY().equalsIgnoreCase(input)) {
                System.out.println("Thong tin NYC can tim la: ");
                System.out.println(_lstNYC.get(i).getMaNY());
                System.out.println(_lstNYC.get(i).toString());
                count++;

                //xoa
                _lstNYC.remove(i);
                break;
            }
        }
        if (count == 0) {
            System.out.println("Khong xoa duoc NYC!");

        }
    }

    public void suaNYC() {
        System.out.println("Nhap ma NYC can tim: ");
        String input = _sc.nextLine();
        int count = 0;
        for (int i = 0; i < _lstNYC.size(); i++) {
            if (_lstNYC.get(i).getMaNY().equalsIgnoreCase(input)) {
                System.out.println("Thong tin can sua: ");
                System.out.println("-1. ho ten");
                System.out.println("-2. nam sinh");
                System.out.println("-3. so do vong 1");
                System.out.println("-4. so do vong 2");
                System.out.println("-5. so do vong 3");
                System.out.println("-----------------");
                System.out.println("nhap lua chon (1-5)");
                int chon = Integer.parseInt(_sc.nextLine());
                //sw+tab
                switch (chon) {
                    case 1:
                        System.out.println("Nhap ho ten moi");
                        String hoTen = _sc.nextLine();
                        _lstNYC.get(i).setHoTen(hoTen);
                        break;
                    case 2:
                        System.out.println("Nhap nam sinh moi");
                        int namSinh= Integer.parseInt(_sc.nextLine());
                        _lstNYC.get(i).setNamSinh(namSinh);
                        break;
//                    case 3:
//                        System.out.println("Nhap so do vong 1 moi");
//                        int soVong1= Integer.parseInt(_sc.nextLine());
//                        _lstNYC.get(i).setgetVong1();
//                        break;
//                    case 4:
//                        System.out.println("Nhap so do vong 2 moi");
//                        int soVong2= Integer.parseInt(_sc.nextLine());
//                        _lstNYC.get(i).setgetVong2(namSinh);
//                        break;
//                    case 5:
//                        System.out.println("Nhap so do vong 3 moi");
//                        intNYC.get(i).setgetVong3(namSinh);
//                        break; soVong3= Integer.parseInt(_sc.nextLine());
//                        _lstNYC.get(i).setgetVong3(namSinh);
//                        break;

                    //..........
                    default:
                        System.out.println("Nhap sai roi!");
                }
//                System.out.println("Nhap ho ten moi: ");
//                String hoTen = _sc.nextLine();
//                _lstNYC.get(i).setHoTen(hoTen);
//                count++;
        System.out.println("Khong xoa duoc NYC!");
//        }
//                break;
                return;
            }
        }
//        if (count == 0) {
    }
    public void sapXepNYC(){
        Collections.sort(_lstNYC, new Comparator<NguoiYeuCu>() {
            @Override
            public int compare(NguoiYeuCu o1, NguoiYeuCu o2) {
//                return o1.getHoTen() .compareTo(o2.getHoTen());//tang dan
                return -o1.getHoTen() .compareTo(o2.getHoTen());//giam dan
//                return o1.getNamSinh() > o2.getNamSinh() ? 1: -1; //==> Tang dan
//                return o1.getNamSinh() < o2.getNamSinh() ? 1: -1; //==> Giam dan
//                if(o1.getNamSinh() > o2.getNamSinh()){
//                    return 1;
//                }else{
//                    return -1;
//                }
            }
        });
    }
    public void fakeData(){
        _lstNYC.add(new NguoiYeuCu("NY01", "Lan", 2001, 90, 60, 90));
        _lstNYC.add(new NguoiYeuCu("NY02", "Hang", 1978, 90, 60, 90));
        _lstNYC.add(new NguoiYeuCu("NY03", "Mai", 2005, 90, 60, 90));
        _lstNYC.add(new NguoiYeuCu("NY04", "Tuyet", 1990, 90, 60, 90));
        _lstNYC.add(new NguoiYeuCu("NY05", "Nbung", 2010, 90, 60, 90));
    }
}
