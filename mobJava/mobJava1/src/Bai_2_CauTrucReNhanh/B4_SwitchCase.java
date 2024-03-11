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
public class B4_SwitchCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==============MENU===========");
        System.out.println("=== 1. Truc luoc =    =");
        System.out.println("====2. Rau luoc       =");
        System.out.println("====3. Thit luoc       =");
        System.out.println("====4. Gao luoc         =");
        System.out.println("=================================");
        System.out.println("May chon mon gi");
        System.out.println("Tao cho mon nay");
        int choise = sc.nextInt();
//        int choise = Integer.parseInt(choise);
//        sw tab
        switch (choise) {
            case 1:
                chucNang1();

                break;
            case 2:
               chucNang2();

                break;
            case 3:
               chucNang3();

                break;
            case 4:
               chucNang4();
                break;

            default:
                System.exit(0);
        }
    }
    public static void chucNang1() {
        System.out.println("Day la mon trung luoc");
    }
    public static void chucNang2() {
         System.out.println("Day la mon rau luoc");
    }
    public static void chucNang3() {
        System.out.println("Day la mon thit luoc");
    }
    public static void chucNang4() {
         System.out.println("Day la mon gao luoc");

    }
}
