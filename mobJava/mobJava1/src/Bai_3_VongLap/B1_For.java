/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_3_VongLap;

import java.util.Scanner;

/**
 *
 * @author tuani
 */
public class B1_For {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n=");
        int n = Integer.parseInt(sc.nextLine());

//        for tab
        for (int i = 0; i < n; i++) {
            System.out.println("i=" + i);
        }
        System.out.println("Break");
        for (int i = 0; i < n; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("i=" + i);
        }
        for (int i = 0; i < n; i++) {
            if (i == 3) {
                break;//thoat khoi vong lap
            }
            System.out.println("i=" + i);
            System.out.println("Continue");
        }
        for (int i = 0; i < n; i++) {
            if (i %2==0) {
                continue;//bo qua vong hien tai
//                tiep tuc voi vong tiep theo
            }
            System.out.println("i=" + i);
        }
    }
}