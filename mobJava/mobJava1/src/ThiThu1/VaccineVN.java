/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThiThu1;

/**
 *
 * @author tuani
 */
public class VaccineVN extends Vaccine{
    private String QuocGia;

    public VaccineVN() {
    }

    public VaccineVN(String QuocGia) {
        this.QuocGia = QuocGia;
    }

    public VaccineVN(String QuocGia, String MaVC, String TenVC, Float ThoiGianTacDung, String NgayHetHan) {
        super(MaVC, TenVC, ThoiGianTacDung, NgayHetHan);
        this.QuocGia = QuocGia;
    }

    public String getQuocGia() {
        return QuocGia;
    }

    public void setQuocGia(String QuocGia) {
        this.QuocGia = QuocGia;
    }

    @Override
    public String toString() {
        return "VaccineVN{" + "QuocGia=" + QuocGia + '}';
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); 
        System.out.println("Quoc gia"+QuocGia);
    }

    @Override
    public void nhapthongtin() {
        super.nhapthongtin();
        
        
    }
    
    
}
