/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_4_Mang;

import java.util.Scanner;

/**
 *
 * @author tuani
 */
public class B2_Mang_Hai_Chieu {
    public static void main(String[] args) {
        /*
        MANG HAI CHIEU
        - row: so hang
        - col: so cot
        
        */
        Scanner sc=new Scanner(System.in);
        int row, col;
        System.out.println("Nhap so hnag row= ");
        row=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap so cot col= ");
        col=Integer.parseInt(sc.nextLine());
        int arrNumber[][]=new int [row][col];
        // gan gia tri
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("arrNumber [%d] [%d]= ",i,j);
                arrNumber[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("arrNumber [%d] [%d] =%d",i,j, arrNumber[i][j]);
                arrNumber[i][j]=sc.nextInt();
            }
        }
        
    }
}
