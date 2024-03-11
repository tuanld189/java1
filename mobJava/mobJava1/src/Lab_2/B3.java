/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_2;

import java.util.Scanner;

/**
 *
 * @author tuani
 */
public class B3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời nhập số điện sử dụng: ");
        int soDienSuDung = sc.nextInt();
        int soTien;
        if(soDienSuDung>0 && soDienSuDung<50){
            soTien = soDienSuDung*1000;
            System.out.println("Số tiền điện đã sử dụng từ 0 - 50 là: " + soTien);
        }else{
            soTien=50*1000+(soDienSuDung-50)*1200;
            System.out.println("Số tiền điện đã sử dụng trên 50 là: "+soTien);
        }
    }
    
}
