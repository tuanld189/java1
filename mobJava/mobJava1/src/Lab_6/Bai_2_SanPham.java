/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_6;

import java.util.Scanner;

/**
 *
 * @author tuani
 */
public class Bai_2_SanPham {
    private String tenSP;
    private double donGia;
    private String hang;

    public Bai_2_SanPham() {
    }

    public Bai_2_SanPham(String tenSP, double donGia, String hang) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.hang = hang;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ten sen pham: ");
        tenSP=sc.nextLine();
        System.out.println("Nhap don gia: ");
        donGia=sc.nextDouble();
        System.out.println("Nhap hang: ");
        hang=new Scanner(System.in).nextLine();
    }
    public void xuat(){
        System.out.println("Ten san pham: "+tenSP);
        System.out.println("Don gia: "+donGia);
        System.out.println("Hang: "+hang);
        
    }
}
