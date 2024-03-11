/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_4_Mang;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author tuani
 */
public class B3_ArrayList {

    //lo et te => kh phai l st
    //PHAN 1
    //1.Khai bao 1 arrayList Khong Dinh Kieu
    public static void main(String[] args) {
        ArrayList lstKDK = new ArrayList();
        lstKDK.add(1);
        lstKDK.add("Huyen xinh gai");
        lstKDK.add(true);
//      2. Duyet arrayList Khong Dinh Kieu
        for (int i = 0; i < lstKDK.size(); i++) {
            System.out.println(lstKDK.get(i));
        }

        //PHAN 2: ArrayLiat Co Dinh Kieu
        // lam viec voi lop kieu du lieu - lop bao
        ArrayList<Integer> lstInteger = new ArrayList<>();
        lstInteger.add(9);
        lstInteger.add(4);
        lstInteger.add(8);
        lstInteger.add(2);

        ArrayList<Double> lstDouble = new ArrayList<>();
        for (Integer i : lstInteger) {
            System.out.print(i+ "");
        }
        System.out.println(" ");
        System.out.println("sap xep tang dan");
        Collections.sort(lstInteger);
        for (int i : lstInteger) {
            System.out.print(i+ "");
        }
        System.out.println(" ");
        System.out.println("sap xep giam dan");
        Collections.reverse(lstInteger);
        for (int i : lstInteger) {
            System.out.print(i+ "");
        }
        System.out.println(" ");

    }
}
