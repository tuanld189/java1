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
public class Bai_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        String hoTen=sc.nextLine();
        hoTen.trim();
        
        String ho=hoTen.substring(0, hoTen.indexOf(" "));
        String tenDem=hoTen.substring(hoTen.indexOf(" "), hoTen.lastIndexOf(" "));
        String ten=hoTen.substring(hoTen.lastIndexOf(" "));
        
        System.out.println("Ho: "+ho.toUpperCase());
        System.out.println("Ten dem: "+tenDem.toUpperCase());
        System.out.println("Ten: "+ten.toUpperCase());
        
    }
}
