/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_9_1_KeThua;

/**
 *
 * @author tuani
 */
public class GiangVien extends Nguoi{
    private String mgv;
    private String emaife;

    public GiangVien() {
    }

    public GiangVien(String mgv, String emaife) {
        this.mgv = mgv;
        this.emaife = emaife;
    }

    public GiangVien(String mgv, String emaife, String ten, String cccd, int tuoi, String diaChi) {
        super(ten, cccd, tuoi, diaChi);
        this.mgv = mgv;
        this.emaife = emaife;
    }

    public String getMgv() {
        return mgv;
    }

    public void setMgv(String mgv) {
        this.mgv = mgv;
    }

    public String getEmaife() {
        return emaife;
    }

    public void setEmaife(String emaife) {
        this.emaife = emaife;
    }

    @Override
    public String toString() {
        return super.toString()+"GiangVien{" + "mgv=" + mgv + ", emaife=" + emaife + '}';
    }
    //in thong tin
    
}
