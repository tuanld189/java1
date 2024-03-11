/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThiThu2;

import java.util.Scanner;

/**
 *
 * @author tuani
 */
public class Cay {
    private int ID;
    private String LoaiCay;
    private String mauLa;

    public Cay() {
    }

    public Cay(int ID, String LoaiCay, String mauLa) {
        this.ID = ID;
        this.LoaiCay = LoaiCay;
        this.mauLa = mauLa;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLoaiCay() {
        return LoaiCay;
    }

    public void setLoaiCay(String LoaiCay) {
        this.LoaiCay = LoaiCay;
    }

    public String getMauLa() {
        return mauLa;
    }

    public void setMauLa(String mauLa) {
        this.mauLa = mauLa;
    }

    @Override
    public String toString() {
        return "Cay{" + "ID=" + ID + ", LoaiCay=" + LoaiCay + ", mauLa=" + mauLa + '}';
    }
    public void inThongTin(){
        System.out.println("========Thong tin cay========");
        System.out.println("ID cay: "+ID);
        System.out.println("Loai cay: "+LoaiCay);
        System.out.println("Mau la: "+mauLa);
    }
    
    public void nhapThongTin(){
        Scanner _sc=new Scanner(System.in);
        System.out.println("Moi nhap ID: ");
        this.ID=Integer.parseInt(_sc.nextLine());
        System.out.println("Moi nhap loai cay: ");
        this.LoaiCay=_sc.nextLine();
        System.out.println("Moi nhap mau la: ");
        this.mauLa=_sc.nextLine();
    }
}
