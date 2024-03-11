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
public class B2_While_DoWhile {
    public static void main(String[] args) {
//        while
//         thuc hien cong viec neu dieu kien con dung
//          =>Kiem tra dieu kien truoc
int n=0;
    while(n<5){
        System.out.println("Ahihi");
    n++;
    }
//        Do...While
//          Cong viec nhac lai it nhat 1 lan
//          => kiem tra dieu klien sau
Scanner sc= new Scanner(System.in);
int tuoi;
do {
    System.out.println("Nhap tuoi=");
    tuoi =Integer.parseInt(sc.nextLine());
    System.out.println("Tuoi cua ban la"+tuoi);
    if(tuoi == 20){
    break;
    }
}while(tuoi>18);
    }
}
