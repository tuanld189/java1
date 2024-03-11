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
public class Bai_2_Main {
    public static void main(String[] args) {
        ArrayList<Bai_2_SanPham> _lstSanPham =new ArrayList<>();
        
        System.out.println("Moi nhap: ");
        for (int i = 0; i < 3; i++) {
            Bai_2_SanPham sp=new Bai_2_SanPham();
            sp.nhap();
            _lstSanPham.add(sp);
        }
        System.out.println("Danh sach: ");
        for (Bai_2_SanPham sp : _lstSanPham) {
            if(sp.getHang().equalsIgnoreCase("Nokia")){
                sp.xuat();
            }
        }
    }
}
