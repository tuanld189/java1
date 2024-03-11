/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThiThu1;

/**
 *
 * @author tuani
 */
public class Vaccine {
    private String MaVC;
    private String TenVC;
    private float ThoiGianTacDung;
    private String NgayHetHan;
    public Vaccine() {
    }

    public Vaccine(String MaVC, String TenVC, Float ThoiGianTacDung, String NgayHetHan) {
        this.MaVC = MaVC;
        this.TenVC = TenVC;
        this.ThoiGianTacDung = ThoiGianTacDung;
        this.NgayHetHan = NgayHetHan;
    }

    public String getMaVC() {
        return MaVC;
    }

    public void setMaVC(String MaVC) {
        this.MaVC = MaVC;
    }

    public String getTenVC() {
        return TenVC;
    }

    public void setTenVC(String TenVC) {
        this.TenVC = TenVC;
    }

    public Float getThoiGianTacDung() {
        return ThoiGianTacDung;
    }

    public void setThoiGianTacDung(Float ThoiGianTacDung) {
        this.ThoiGianTacDung = ThoiGianTacDung;
    }

    public String getNgayHetHan() {
        return NgayHetHan;
    }

    public void setNgayHetHan(String NgayHetHan) {
        this.NgayHetHan = NgayHetHan;
    }

    @Override
    public String toString() {
        return "Vaccine{" + "MaVC=" + MaVC + ", TenVC=" + TenVC + ", ThoiGianTacDung=" + ThoiGianTacDung + ", NgayHetHan=" + NgayHetHan + '}';
    }
    public void inThongTin(){
        System.out.println("---Thong tin---");
        System.out.println("Ma vaccine: "+MaVC);
        System.out.println("Ten vaccine: "+TenVC);
        System.out.println("Thoi gian tac dung: "+ThoiGianTacDung);
        System.out.println("Ngay het han: "+NgayHetHan);
    }
    public   void nhapthongtin(){
        
    }
}
