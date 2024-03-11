/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_5_3;
import java.util.Scanner;

/**
 *
 * @author tuani
 */
public class Main {
    public static void main(String[] args) {
        QLSanPham qlsanpham = new QLSanPham();
        int chon;

        do {
            System.out.println("--------------MENU--------------");
            System.out.println("1.Nhập danh sách sản phẩm từ bàn phím");
            System.out.println("2.Sắp xếp giảm dần theo giá và xuất ra màn hình");
            System.out.println("3.Tìm và xóa sản phẩm theo tên nhập từ bàn phím");
            System.out.println("4.Xuất giá trung bình của các sản phẩm");
            Scanner sc = new Scanner(System.in);
            System.out.println("Mời chọn:");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1: {
                    qlsanpham.nhapSP();
                    break;
                }
                case 2: {
                    qlsanpham.sapXepSP();
                    qlsanpham.xuatSP();
                    break;
                }
                case 3: {
                    qlsanpham.xoaSP();
                    break;
                }
                case 4: {
                    qlsanpham.TBSP();
                    break;
                }
                case 0: {
                    System.out.println("Thoát");
                    break;
                }
                default: {
                    System.out.println("Không tồn tại!!");
                }
            }
        } while (chon != 0);
    }
}
