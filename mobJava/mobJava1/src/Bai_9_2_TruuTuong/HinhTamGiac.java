/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_9_2_TruuTuong;

/**
 *
 * @author tuani
 */
public  class HinhTamGiac extends Hinh{
    private int a;
    private int b;
    private int c;

    public HinhTamGiac() {
    }

    public HinhTamGiac(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public HinhTamGiac(int a, int b, int c, String ten) {
        super(ten);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double tinhChuVi() {
        return a+b+c;
    }

    @Override
    public double tinhDienTich() {
        double p=(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    
}
