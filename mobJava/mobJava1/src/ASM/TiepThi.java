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
public class TiepThi extends NhanVienHanhChinh {
    
    ArrayList<TiepThi> _lstTT;

    private double doanhSo;
    private double hoaHong;

    public TiepThi(double doanhSo, double hoaHong) {
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    public TiepThi(double doanhSo, double hoaHong, String maNV, String hoTen, double luong, String chucVu) {
        super(maNV, hoTen, luong, chucVu);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
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
        return "TiepThi{" + "doanhSo=" + doanhSo + ", hoaHong=" + hoaHong + '}';
    }

    @Override
    public double getThuNhap() {
        return luong + doanhSo * hoaHong;
    }
}
