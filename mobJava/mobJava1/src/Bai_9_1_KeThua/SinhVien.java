/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_9_1_KeThua;

/**
 *
 * @author tuani
 */
public class SinhVien extends Nguoi{
    //LOP SV KE THUA TU LOP NGUOI
    //THUOC TINH RIENG
    private String mssv;
    private String mallfpt;
    // 
    public SinhVien() {
    }
    //insetcode+constror...
    public SinhVien(String mssv, String mallfpt) {
        this.mssv = mssv;
        this.mallfpt = mallfpt;
    }

    public SinhVien(String mssv, String mallfpt, String ten, String cccd, int tuoi, String diaChi) {
        super(ten, cccd, tuoi, diaChi);
        this.mssv = mssv;
        this.mallfpt = mallfpt;
    }
//insetcode+  getter and setter
    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getMallfpt() {
        return mallfpt;
    }

    public void setMallfpt(String mallfpt) {
        this.mallfpt = mallfpt;
    }
//insetcode+ toString
    @Override
    public String toString() {
        return super.toString()+"SinhVien{" + "mssv=" + mssv + ", mallfpt=" + mallfpt + '}';
    }
    //in thong tin
   //super
    //inset code ==> Override metho
    @Override
    public void inThongTin() {
        super.inThongTin(); 
        System.out.println("MSSV"+mssv);
        System.out.println("Mail FPT"+mallfpt);
    }
    
}
