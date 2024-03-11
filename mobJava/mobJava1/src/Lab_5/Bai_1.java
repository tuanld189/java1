/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tuani
 */
public class Bai_1 {

    private ArrayList<Double> _lst = new ArrayList<>();

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bhap danh sach so thuc");
        while (true) {
            System.out.println("Nhap so: ");
            Double x = sc.nextDouble();
            _lst.add(x);
            sc.nextLine();
            System.out.println("Nhap tiep du lieu (Y/N): ");
            if (sc.nextLine().equals("N")) {
                break;
            }
        }
    }

    public void hienThi() {
        System.out.println("--------------");
        for (Double lstX : _lst) {
            System.out.println("  " + lstX);
        }
    }
    public void tinhTong(){
        double tong=0;
        for (Double lstX : _lst) {
            tong += lstX;
        }
        System.out.println("Tong= "+tong);
    }
}
