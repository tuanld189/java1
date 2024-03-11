/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_2_CauTrucReNhanh;

import java.util.Scanner;

/**
 *
 * @author tuani
 */
public class B1_Try_Catch {
    /*
    - Try...catch de kiem soat loi
    - Cach go: try + ctrl + cach
    */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {          
            System.out.println("Nhap so tien luong");
            double luong=sc.nextDouble();
            System.out.println("'Luong="+luong);

        } catch (Exception e) {
            System.out.println("Loi r");
        }
}
}
