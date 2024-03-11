/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThiThu1;

import java.util.Scanner;

/**
 *
 * @author tuani
 */
public class Main {
    public static void main(String[] args) {
        QLVC qlvc=new QLVC();
        int chon;
        
        do{
            System.out.println("-----MENU-----");
            System.out.println("1. Nhập danh sách đối tượng từ bàn phím");
            System.out.println("2. Xuất danh sách đối tượng");
            System.out.println("3. Xuất danh sách Vaccine(ThoiGianTacDung>=6 tháng)");
            System.out.println("4. Sắp xếp giảm dần theo ThoiGianTacDung");
            System.out.println("5. Kế thừa");
            System.out.println("0. Thoát");
            Scanner sc= new Scanner(System.in);
            System.out.println("Mời chọn");
            chon=Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    qlvc.nhapVC();
                    break;
                case 2:
                    qlvc.xuatVC();
                    break;
                case 3:
                    break;
                case 4:
                    qlvc.sapxep();
                    qlvc.xuatVC();
                case 5:
                    Vaccine VaccinVN=new Vaccine();
                    
                    VaccinVN.inThongTin();
                case 0:
                    System.out.println("0. Thoát");
                    System.exit(chon);
                default:
                    System.out.println("Giá trị không tồn tại!!!");
            }
        }while(chon!=0);
    }
}
