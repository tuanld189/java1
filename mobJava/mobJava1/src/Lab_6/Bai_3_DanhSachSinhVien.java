/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_6;

import java.util.ArrayList;

/**
 *
 * @author tuani
 */
public class Bai_3_DanhSachSinhVien {
    private ArrayList<Bai_3_SinhVien> _lst=new ArrayList<>();
    public void nhap(){
        for (int i = 0; i < 2; i++) {
            Bai_3_SinhVien sv=new Bai_3_SinhVien();
            sv.nhap();
            _lst.add(sv);
        }
    }
    
    public void xuat(){
        System.out.println("Danh sach sih vien");
        for (Bai_3_SinhVien iteam: _lst){
            iteam.xuat();
        }
    }
}
