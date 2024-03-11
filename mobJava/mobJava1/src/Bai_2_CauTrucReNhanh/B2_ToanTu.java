/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_2_CauTrucReNhanh;

/**
 *
 * @author tuani
 */
public class B2_ToanTu {
    /*
    * 4 loai toan tu
    1. Toan tu so hoc: +, -,*,/ % ++ --
    2. Toan tu so sanh: > < >= <= == !=
    3. Toam tu logic: && || !
    4. Toan tu gan: = += -= /= *= %=
    
    * TOAN TU BA NGOI
    <bieu thuc dieu kien> ? <gia tri dung> : < <gia tri sai>
    
    */
    public static void main(String[] args) {
        boolean test=5>6;
        System.out.println("test");
        double luong =8000;
        boolean check = (luong>5000) ? true: false;
        // String     ...       "true" "false"
        System.out.println(check);
        
        /* Cac ham toan hoc:
        Math.max(a,b) :Tim GTLN
        Math.min(a,b) :Tim GTNN
        Math.pow(a,b): a mu b
        Math.sqrt(a): can bac 2 cua a
        Math.abs(a): tri tuyet doi
        Math.ceil(a): lam tron le
        Math.float(a): lam ron xuong
        Math.random: Ngau nhien tu 0-1
        */
        int a=5, b=9;
        int pow= (int) Math.pow(a, b);
        int min=Math.min(a, b);
        int max=Math.max(a, b);
        System.out.println("pow="+pow);
        System.out.println("min"+min);
        System.out.println("max="+max);
    }
}
