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
public class B2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Mời nhập số thứ nhất: ");
        int soThuNhat=sc.nextInt();
        System.out.println("Mời nhập số thứ hai: ");
        int soThuHai=sc.nextInt();
        System.out.println("Mời nhập số thứ ba:");
        int soThuBa=sc.nextInt();
        if(soThuNhat == 0){
            if(soThuHai == 0){
                System.out.println("Phương trình vô nghiêm");
            }else{
                System.out.println("Phương trình có một nghiệm"+"X="+(-soThuBa/soThuHai));
            }
        }
        float delta = soThuHai*soThuHai - 4*soThuNhat*soThuBa;
        float nghiemThuNhat;
        float nghiemThuHai;
        if(delta>0){
            nghiemThuNhat=(float) ((-soThuHai + Math.sqrt(delta)) / (2*soThuNhat));
            nghiemThuHai=(float) ((-soThuHai - Math.sqrt(delta)) / (2*soThuNhat));
            System.out.println("Phương trình có hai nghiệm là: " +"Nghiệm thứ nhất là: "+nghiemThuNhat +"Nghiệm thứ hai là: "+nghiemThuHai);
        }
        else if(delta==0){
            nghiemThuNhat=(soThuHai/(2*soThuNhat));
            System.out.println("Phương trình có nghiệm kép: "+"Nghiệm của phương trình là: "+nghiemThuNhat);
        }
        else{
            System.out.println("Phương trình vô nghiệm!!!");
        }
    }
}
