/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_6;

import java.util.Scanner;

/**
 *
 * @author tuani
 */
public class Bai_3_SinhVien {
    private String hoTen;
    private String email;
    private String soDienThoai;
    private String CMND;

    public Bai_3_SinhVien() {
    }

    public Bai_3_SinhVien(String hoTen, String email, String soDienThoai, String CMND) {
        this.hoTen = hoTen;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.CMND = CMND;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
        
        
    }
    
    
    
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Nhap ho ten: ");
            hoTen=sc.nextLine();
            if(hoTen==null | hoTen.equals(" ")){
                System.out.println("Ho ten khong hop le!!!");
            }else{
                break;
            }
        }while(true);
        
        Bai_3_DuLieu ds=new Bai_3_DuLieu();
        do {
            System.out.println("Nhap email: ");
            email=sc.nextLine();
            if(ds.email(email)){
                break;
            }
            System.out.println("Email khong hop le!!!");
        } while (true);
        
        
        do {
            System.out.println("Nhap so dien thoai: ");
            soDienThoai=sc.nextLine();
            if(ds.soDienThoai(soDienThoai)){
                break;
            }
            System.out.println("So dien thoai khong hop le!!!");
        } while (true);
        
        do {
            System.out.println("Nhap CMND: ");
            CMND=sc.nextLine();
            
            if(ds.CMND(CMND)){
                break;
            }
            System.out.println("CMND khong hop le!!!");
        } while (true);
    }
    
    public void xuat(){
        System.out.println("Bai_3_SinhVien{" + "hoTen=" + hoTen + ", email=" + email + ", soDienThoai=" + soDienThoai + ", CMND=" + CMND + '}');
    }

}
