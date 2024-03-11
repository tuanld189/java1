/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_9_2_TruuTuong;

/**
 *
 * @author tuani
 */
public class Main {

    public static void main(String[] args) {
        Hinh hinh1 = new HinhTamGiac(3, 4, 5, "hinh tam giac");
        System.out.println("Chu vi" + hinh1.getTen() + "la= " + hinh1.tinhChuVi());
        System.out.println("Dien tich" + hinh1.getTen() + "la= " + hinh1.tinhDienTich());

        Hinh hinh2 = new HinhVuong(9, "Hinh vuonh");
        System.out.println("Chu vi" + hinh2.getTen() + "la= " + hinh2.tinhChuVi());
        System.out.println("Dien tich" + hinh2.getTen() + "la= " + hinh2.tinhDienTich());

    }
}
