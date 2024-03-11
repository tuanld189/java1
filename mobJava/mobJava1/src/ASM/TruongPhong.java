/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM;

import java.util.ArrayList;

/**
 *
 * @author tuani
 */
public class TruongPhong extends NhanVienHanhChinh {
    
    ArrayList<TruongPhong> _lstTP;
    private double trachNhiem;
    TruongPhong _TP;
    public TruongPhong(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    public TruongPhong(double trachNhiem, String maNV, String hoTen, double luong, String chucVu) {
        super(maNV, hoTen, luong, chucVu);
        this.trachNhiem = trachNhiem;
    }

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "TruongPhong{" + "trachNhiem=" + trachNhiem + '}';
    }

    @Override
    public double getThuNhap() {
        return luong + trachNhiem;
    }

}
