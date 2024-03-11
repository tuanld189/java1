/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_9_1_KeThua;

/**
 *
 * @author tuani
 */
public class Main {
    public static void main(String[] args) {
        //constructor co tham so
        SinhVien sv1=new SinhVien("PH1", "ph1@fpt", "Anh", "12345678", 18, "HN");
        //constructor kh tham so
        SinhVien sv2=new SinhVien();
        sv2.setMssv("PH2");
        sv2.setMallfpt("ph2@fpt");
        sv2.setTen("Binh");
        sv2.setCccd("98765432");
        sv2.setTuoi(20);
        sv2.setDiaChi("NB");
        
        System.out.println(sv1.toString());
        System.out.println(sv2.toString());
        sv1.inThongTin();
    }
}
