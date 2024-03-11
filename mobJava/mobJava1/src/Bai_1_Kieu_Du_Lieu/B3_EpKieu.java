/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_1_Kieu_Du_Lieu;

/**
 *
 * @author tuani
 */
public class B3_EpKieu {
    public static void main(String[] args) {
/*
    1. Ep kieu trong Java
    - La viec gan gia tri cua 1 bien co kieu du lieu nay ==> Kieu du lieu khac
    2. Cac loai ep kieu
        - Noi rong ( Widening ): ep kieu DL co kich thuoc nho ==> lon
          ==> Thong tin khong mat di
        - Thu hep (Narrowing): ep kieu DL co kich thuoc lon ==> nho
          ==> Thong tin bi mat di
        *8 kieu du lieu: boolean, byte, short, int, long, float, double
        
        */
int a=5;
double b= 9.6;
a= (int)b; //Ep kieu tuong minh
b=a; //ep kieu ngam dinh
System.out.println("a="+a);
System.out.println("b="+b);

//2. ep kieu string ve so
String tienLuong="2000", thuong="1000";
String ketQua= tienLuong + thuong;
        System.out.println("Ket qua"+ ketQua);
        int tong= Integer.parseInt(tienLuong) + Integer.parseInt(thuong);
        System.out.println("Tong="+tong);
        
        String canNang1="40.5";
        String canNang2="50.5";
        double result=Double.parseDouble(canNang1)+ Double.parseDouble(canNang2);
        System.out.println("Can nang"+ result);
        
        String chieuCao1="1.72";
        String chieuCao2="1.28";
        
        double chieuCao =Double.parseDouble(chieuCao1)* Double.parseDouble(chieuCao2);
        System.out.println("Chieu cao"+chieuCao);
/*
        Cac loai ep kieu tu String ve so:
        - Integer.parseInt(<String>)
        - Double.parseDouble(<String>)
        - Float.parseFloat(<String>)
        - Byte.parseByte(<String>)
        .........
        */        
    }
}
