/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_4_Mang;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author tuani
 */
public class B1_Array {

    public static void main(String[] args) {
        /*
        Array: 1 tap gia tri co cung kieu du lieu
         */
//        ctrl +R: rename(doi ten taat ca)
        int arrNumber[] = new int[5];// khai bao 1 mang so nguyen gom 5 phan tu
        arrNumber[0] = 3; // gan gia tri
        arrNumber[1] = 5;
        arrNumber[2] = 3;
        arrNumber[3] = 8;
        arrNumber[4] = 4;

        System.out.println("arr[0]" + arrNumber[0]);
        String arrName[] = {"FPT", "FOLY", "HN"};
        for(int i=0; i<arrName.length; i++){
            System.out.println("arrName 1="+arrName[i]);
        }
//        for each
/*
          for (<kieu du lieu> arg: args ){
}
arg: dai dien gia tri
args: tap/mang

for each ==> khong thay doi duoc gia tri trong mang
*/
//        fore + tab
for (String name : arrName) {
            System.out.println(name);
        }
    
//    duyet mang so nguyen
System.out.println("duyet mang so nguyen");
        for (int i = 0; i < arrNumber.length; i++) {
            //arrNumber[i]=0;
            System.out.print(arrNumber[i]+"");
        }
        System.out.println("");
        for (int i : arrNumber) {
            i=0;
            System.out.print(i+ " ");
        }
        System.out.println(" ");
        for (int i : arrNumber) {
            System.out.print(i+ "");
        }
        System.out.println(" ");
        
        System.out.println("sap xep tang dan");
        Arrays.sort(arrNumber);
        for (int i : arrNumber) {
            System.out.print(i+ "");
        }
        System.out.println("");
        System.out.println("tim kiem nhi phan");
        int index=Arrays.binarySearch(arrNumber, 8);
        System.out.println("n="+index);
    }
}
