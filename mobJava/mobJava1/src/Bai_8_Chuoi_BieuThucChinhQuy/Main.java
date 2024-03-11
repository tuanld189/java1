/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_8_Chuoi_BieuThucChinhQuy;

/**
 *
 * @author tuani
 */
public class Main {
    public static void main(String[] args) {
        ChuoiService cs=new ChuoiService();
        int n=cs.checkInputNumber();
        System.out.println("n= "+n);
        String hoTen=cs.checkInputString();
        System.out.println("hoTen= "+hoTen);
        String ngaySinh=cs.checkInputDate();
        System.out.println("Ngay sinh: "+ngaySinh);
        String email=cs.checkInputEmail();
        System.out.println("Email: "+email);
    }
}
