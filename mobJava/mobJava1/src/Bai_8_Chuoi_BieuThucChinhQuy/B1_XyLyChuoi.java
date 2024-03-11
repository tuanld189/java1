/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_8_Chuoi_BieuThucChinhQuy;

/**
 *
 * @author tuani
 */
public class B1_XyLyChuoi {

    public static void main(String[] args) {
        String truong = "FPT Fpolytechnic";
        System.out.println(truong);
        //toLowerCase(): viet thuong
        System.out.println(truong.toLowerCase());
        //toUpperCase(): viet hoa
        System.out.println(truong.toUpperCase());
        //trim(): xoa khoang trang ow dau va cuoi chuoi
        System.out.println("......");
        System.out.println(truong.trim());
        //lengh(): do dai
        System.out.println(truong.length());
        //
        System.out.println(truong.trim().substring(4));
        System.out.println(truong.trim().substring(1, 6));
        //
        System.out.println(truong.trim().charAt(0));
        //replace..................
        String monHoc = "Java      Lap trinh huong doi tuong";
        System.out.println(monHoc);
        String result[] = monHoc.split("\\s+");
        //fore + tab
        for (String str : result) {
            System.out.println(str);
        }
        System.out.println("Kiem tra co khop hay khong?");
        System.out.println("(.*)trinh(.*)");

    }
}
