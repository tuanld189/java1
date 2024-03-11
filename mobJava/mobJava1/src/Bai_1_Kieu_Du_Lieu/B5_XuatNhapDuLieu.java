package Bai_1_Kieu_Du_Lieu;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author tuani
 */
public class B5_XuatNhapDuLieu {

    public static void main(String[] args) {
//1.Xuat ra man hinh
//sout + tab
        System.out.print("FPT Polytechnic");
        System.out.println("Trinh Van Bo");
        System.out.printf("nam nay la %d", 2004);
        System.out.printf("Nam nau la " + 2004 +"\n");
//2. Nhap du lieu tu ban phim
//scanf ==> scanf_s
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ho va ten");
        String name = scanner.nextLine();// cho phep nhap 1 chuoiu tu ban phim
        System.out.println("Nhap tuoi");
        int tuoi = scanner.nextInt();//cho phep nhap 1 so nguyen tu ban phim
        scanner.nextLine();//****
        System.out.println("Nhap di chi");
        String diaChi = scanner.nextLine();
        System.out.println("Ten toi la: "+name);
        System.out.println("Toi la: "+tuoi);
        System.out.println("dia chi: "+diaChi);

    }
}
