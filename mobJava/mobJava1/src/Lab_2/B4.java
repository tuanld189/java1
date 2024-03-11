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
public class B4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("+---------------------------------------------------+");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc 2");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Kết thúc");
        System.out.println("+---------------------------------------------------+");
        System.out.println("Mời chọn chức năng: ");
        int chucNang =  sc.nextInt();
//            int chucNang=Integer.parseInt(switch();
        switch (chucNang) {
            case 1:
                chucNang1();
                break;

            case 2:
                chucNang2();
                break;

            case 3:
                chucNang3();
                break;

            case 4:
                chucNang4();
                break;

            default:
                System.exit(0);
        }
    }

    public static void chucNang1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số a: ");
        double nghiem;
        int soThuNhat = sc.nextInt();
        System.out.println("Mời nhập số b: ");
        int soThuHai = sc.nextInt();
        System.out.println("Phương trình nhập vào: " + soThuNhat + "x +" + soThuHai + "=0.");
        if (soThuNhat == 0) {
            if (soThuHai == 0) {
                System.out.println("Thông báo vô số nghiệm");
            } else {
                System.out.println("Thông báo vô nghiệm");
            }
        } else {
            nghiem = (double) -soThuHai / soThuNhat;
            System.out.println("Phương trình có nghiệm x=" + nghiem + ".");
        }
    }

    public static void chucNang2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số thứ nhất: ");
        int soThuNhat = sc.nextInt();
        System.out.println("Mời nhập số thứ hai: ");
        int soThuHai = sc.nextInt();
        System.out.println("Mời nhập số thứ ba:");
        int soThuBa = sc.nextInt();
        if (soThuNhat == 0) {
            if (soThuHai == 0) {
                System.out.println("Phương trình vô nghiêm");
            } else {
                System.out.println("Phương trình có một nghiệm" + "X=" + (-soThuBa / soThuHai));
            }
        }
        float delta = soThuHai * soThuHai - 4 * soThuNhat * soThuBa;
        float nghiemThuNhat;
        float nghiemThuHai;
        if (delta > 0) {
            nghiemThuNhat = (float) ((-soThuHai + Math.sqrt(delta)) / (2 * soThuNhat));
            nghiemThuHai = (float) ((-soThuHai - Math.sqrt(delta)) / (2 * soThuNhat));
            System.out.println("Phương trình có hai nghiệm là: " + "Nghiệm thứ nhất là: " + nghiemThuNhat + "Nghiệm thứ hai là: " + nghiemThuHai);
        } else if (delta == 0) {
            nghiemThuNhat = (soThuHai / (2 * soThuNhat));
            System.out.println("Phương trình có nghiệm kép: " + "Nghiệm của phương trình là: " + nghiemThuNhat);
        } else {
            System.out.println("Phương trình vô nghiệm!!!");
        }
    }

    public static void chucNang3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số điện sử dụng: ");
        int soDienSuDung = sc.nextInt();
        int soTien;
        if (soDienSuDung > 0 && soDienSuDung < 50) {
            soTien = soDienSuDung * 1000;
            System.out.println("Số tiền điện đã sử dụng từ 0 - 50 là: " + soTien);
        } else {
            soTien = 50 * 1000 + (soDienSuDung - 50) * 1200;
            System.out.println("Số tiền điện đã sử dụng trên 50 là: " + soTien);
        }
    }

    public static void chucNang4() {
        System.exit(0);

    }
}
