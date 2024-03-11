/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_2;

import java.util.Scanner;

/**
 *
 * @author tuani
 */
public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số a: ");
        double nghiem;
        int soThuNhat = sc.nextInt();
        System.out.println("Mời nhập số b: ");
        int soThuHai = sc.nextInt();
        System.out.println("Phương trình nhập vào: "+soThuNhat + "x +"+soThuHai+ "=0.");
        if(soThuNhat == 0){
            if(soThuHai == 0){
                System.out.println("Thông báo vô số nghiệm");
            }else{
                System.out.println("Thông báo vô nghiệm");
            }
        }else{
            nghiem=(double)-soThuHai/soThuNhat;
            System.out.println("Phương trình có nghiệm x="+nghiem+".");
        }
    }
}
