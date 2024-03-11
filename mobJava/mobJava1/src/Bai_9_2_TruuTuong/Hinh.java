/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_9_2_TruuTuong;

/**
 *
 * @author tuani
 */
 public abstract class Hinh {
    private String ten;
    abstract public double tinhChuVi();
    
    abstract public double tinhDienTich();
    
    
    

    public Hinh() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Hinh(String ten) {
        this.ten = ten;
    }
    
}
