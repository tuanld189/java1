/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThiThu4;

import java.util.Scanner;

/**
 *
 * @author tuani
 */
public class PhuongTien {
    private String maPT;
    private String tenPT;
    private String tenHangSanXuat;
    private String tenQuocGia;
    private int namSanXuat;

    public PhuongTien() {
    }

    public PhuongTien(String maPT, String tenPT, String tenHangSanXuat, String tenQuocGia, int namSanXuat) {
        this.maPT = maPT;
        this.tenPT = tenPT;
        this.tenHangSanXuat = tenHangSanXuat;
        this.tenQuocGia = tenQuocGia;
        this.namSanXuat = namSanXuat;
    }

    public String getMaPT() {
        return maPT;
    }

    public void setMaPT(String maPT) {
        this.maPT = maPT;
    }

    public String getTenPT() {
        return tenPT;
    }

    public void setTenPT(String tenPT) {
        this.tenPT = tenPT;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    @Override
    public String toString() {
        return "PhuongTien{" + "maPT=" + maPT + ", tenPT=" + tenPT + ", tenHangSanXuat=" + tenHangSanXuat + ", tenQuocGia=" + tenQuocGia + ", namSanXuat=" + namSanXuat + '}';
    }
    public void inThongTin(){
        System.out.println("=====THONG TIN PHUONG TIEN=====");
        System.out.println("Ma phuong tien: "+maPT);
        System.out.println("Ten phuong tien: "+tenPT);
        System.out.println("Ten hang san xuat: "+tenHangSanXuat);
        System.out.println("Ten quoc gia: "+tenQuocGia);
        System.out.println("Nam san xuat: "+namSanXuat);
    }
    public void nhapThongTin(){
        Scanner _sc=new Scanner(System.in);
        System.out.println("Moi nhap ma phuong tien: ");
        this.maPT=_sc.nextLine();
        System.out.println("Moi nhap ten phuong tien: ");
        this.tenPT=_sc.nextLine();
        System.out.println("Moi nhap hang san xuat: ");
        this.tenHangSanXuat=_sc.nextLine();
        System.out.println("Moi nhap ten quoc gia: ");
        this.tenQuocGia=_sc.nextLine();
        System.out.println("Moi nhap nam san xuat: ");
        this.namSanXuat=Integer.parseInt(_sc.nextLine());
        
    }
}
