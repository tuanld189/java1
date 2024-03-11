/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_9_1_KeThua;

/**
 *
 * @author tuani
 */
public class Nguoi {
    private String ten;
    private String cccd;
    private int tuoi;
    private String diaChi;

    public Nguoi() {
    }

    public Nguoi(String ten, String cccd, int tuoi, String diaChi) {
        this.ten = ten;
        this.cccd = cccd;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }
    
    //toString

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Nguoi{" + "ten=" + ten + ", cccd=" + cccd + ", tuoi=" + tuoi + ", diaChi=" + diaChi + '}';
    }
    public void inThongTin(){
        
        System.out.println("Thong ");
        System.out.println("ten"+ten);        
        System.out.println("cccd"+cccd);        
        System.out.println("tuoi"+tuoi);        
        System.out.println("dia chi"+diaChi);        
    }
}
