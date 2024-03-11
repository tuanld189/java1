/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_9_2_TruuTuong;

/**
 *
 * @author tuani
 */
public class HinhVuong extends Hinh{
    private int canh;

    public HinhVuong() {
    }
    

    public HinhVuong(int canh) {
        this.canh = canh;
    }

    public HinhVuong(int canh, String ten) {
        super(ten);
        this.canh = canh;
    }

    @Override
    public double tinhChuVi() {
        return canh*4;
    }

    @Override
    public double tinhDienTich() {
        return Math.pow(canh, 2);
    }
    
}
