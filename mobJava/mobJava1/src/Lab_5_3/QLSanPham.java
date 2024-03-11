/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_5_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author tuani
 */
public class QLSanPham {
    List<SanPham> _lstSanPham;
    Scanner _sc = new Scanner(System.in);
    SanPham _sanPham;
    String _input;

    public QLSanPham() {
        _lstSanPham = new ArrayList<>();
    }

    public void nhapSP() {
        String yesNo;
        do {
            _sanPham = new SanPham();
            System.out.println("Nhập tên sản phẩm:");
            String ten = _sc.nextLine();
            _sanPham.setTen(ten);
            System.out.println("Nhập giá sản phẩm: ");
            double gia = Double.parseDouble(_sc.nextLine());
            _sanPham.setGia(gia);
            _lstSanPham.add(_sanPham);
            System.out.println("Có muốn tiếp tục Yes/No (Y/N)?");
            yesNo = _sc.nextLine();
//            if (yesNo.equalsIgnoreCase("N")) {
//                break;
//            }
        } while (yesNo.equalsIgnoreCase("Y"));
    }
    
    public void xuatSP(){
        for (SanPham sanPham : _lstSanPham) {
            System.out.println(sanPham.toString());
        }
    }
    
    public void sapXepSP(){
        System.out.println("Sắp xếp theo giá giảm dần: ");
        Collections.sort(_lstSanPham, new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return o1.getGia() > o2.getGia() ?1:-1;
            }
        });
    }
    
    public void xoaSP(){
        System.out.println("Nhập tên sản phẩm cần xóa: ");
        _input=_sc.nextLine();
        for (int i = 0; i < _lstSanPham.size(); i++) {
            if(_lstSanPham.get(i).getTen().equalsIgnoreCase(_input)){
                System.out.println("Thông tin sản phẩm cần xóa:");
                System.out.println(_lstSanPham.get(i).toString());
                _lstSanPham.remove(i);
                System.out.println("Xóa thành công!!");
                return;
            }
        }
        System.out.println("Xóa không thành công!!!");
    }
    
    public void TBSP(){
        double sum=0;
        System.out.println("Giá TB sản phẩm:");
        for (int i = 0; i < _lstSanPham.size(); i++) {
            sum= sum+ _lstSanPham.get(i).getGia();
        }
        double TB=sum/_lstSanPham.size();
        System.out.println("Giá TB= "+ TB);
    }
    
    
}
