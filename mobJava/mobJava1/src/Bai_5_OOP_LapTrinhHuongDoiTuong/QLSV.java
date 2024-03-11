/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_5_OOP_LapTrinhHuongDoiTuong;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tuani
 */
public class QLSV {
    public static void main(String[] args) {
        //Khởi tạo đối tượng mới= constructor có tham số
        SinhVien svPoly= new SinhVien("PH12345", "HuyenNK6", 2004, 9.5);
        System.out.println(svPoly.toString());
         //Khởi tạo đối tượng mới= constructor không tham số
        SinhVien sv= new SinhVien();
        sv.setMsv("PH67890");
        sv.setHoTen("DucKT");
        sv.setNamSinh(2002);
        sv.setDiem(3);
        
        System.out.println(sv.toString());
        sv.inThongTin();
        
        System.out.println("MSV= "+ sv.getMsv());
        System.out.println("Ho va ten= "+svPoly.getHoTen());
        //thêm đối tượng vào list
        List<SinhVien> lstSV= new ArrayList<>();
        lstSV.add(sv);
        lstSV.add(svPoly);
        //in danh sách
        //fore+ tab
        System.out.println("Danh sach SV");
        for (SinhVien sinhVien : lstSV) {
            System.out.println(sinhVien.toString());
        }
    }
}
