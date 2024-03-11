/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_6_BaiTap_OOP_ArrayList;

/**
 *
 * @author tuani
 */
public class NguoiYeuCu {
    //private tất cả thuộc tính
    private String maNY;
    private String hoTen;
    private int namSinh;
    private double vong1;
    private double vong2;
    private double vong3;
    //Constructor
    //constructor không tham số
    public NguoiYeuCu() {
    }
    //constructor có tham số
    public NguoiYeuCu(String maNY, String hoTen, int namSinh, double vong1, double vong2, double vong3) {
        this.maNY = maNY;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.vong1 = vong1;
        this.vong2 = vong2;
        this.vong3 = vong3;
    }
    //Getter and setter
    //Click chuột phải => insert code => getter and setter => select all => gen
    public String getMaNY() {
        return maNY;
    }

    public void setMaNY(String maNY) {
        this.maNY = maNY;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getVong1() {
        return vong1;
    }

    public void setVong1(double vong1) {
        this.vong1 = vong1;
    }

    public double getVong2() {
        return vong2;
    }

    public void setVong2(double vong2) {
        this.vong2 = vong2;
    }

    public double getVong3() {
        return vong3;
    }

    public void setVong3(double vong3) {
        this.vong3 = vong3;
    }
    //toString
    @Override
    public String toString() {
        return "NguoiYeuCu{" + "maNY=" + maNY + ", hoTen=" + hoTen + ", namSinh=" + namSinh + ", vong1=" + vong1 + ", vong2=" + vong2 + ", vong3=" + vong3 + '}';
    }
    
    //inThongTin()
    public void inThongTin(){
        System.out.println("Nguoi Yeu Cu");
        System.out.println("Ma NY= "+ maNY);
        System.out.println("Ho ten= "+ hoTen);
        System.out.println("Nam sinh= "+ namSinh);
        System.out.println("So do 3 vong= "+ vong1+"- "+vong2+"- "+vong3);
    }
}
