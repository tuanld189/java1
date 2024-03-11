/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_5_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tuani
 */
public class Menu {
    List<HoTen> _lstDSHT;
    Scanner _sc = new Scanner(System.in);
    HoTen _hoTen;

    public Menu() {
        _lstDSHT = new ArrayList<>();
    }

    public void nhapDS() {
        String yesNo;
        do {

            _hoTen = new HoTen();
            System.out.println("Nhập họ tên:");
            String hoTen = _sc.nextLine();
            _hoTen.setHoTen(hoTen);
            _lstDSHT.add(_hoTen);
            System.out.println("Có muốn tiếp tục Yes/No (Y/N)?");
            yesNo = _sc.nextLine();
            if (yesNo.equalsIgnoreCase("N")) {
                break;
            }

        } while (true);

    }

    public void xuatDS() {
        for (HoTen menu : _lstDSHT) {
            System.out.println(menu.toString());
        }
    }

    public void xuatNgauNhienDS() {
        Collections.shuffle(_lstDSHT);
        xuatDS();
    }

    public void sapXepGiamDanDS() {
        Collections.sort(_lstDSHT, new Comparator<HoTen>() {
            @Override
            public int compare(HoTen o1, HoTen o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        });
        Collections.reverse(_lstDSHT);
        xuatDS();
    }

    public void timVaXoaDS() {
        int count = 0;
        System.out.println("Nhập tên cần xóa:");
        String input = _sc.nextLine();
        for (int i = 0; i < _lstDSHT.size(); i++) {
            if (_lstDSHT.get(i).getHoTen().equalsIgnoreCase(input)) {
                System.out.println("Tên cần xóa:");
                System.out.println(_lstDSHT.get(i).toString());
                _lstDSHT.remove(i);
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy tên");
        }
    }

    public void menu() {
        int chon;
        do {
            System.out.println("-----------MENU------------");
            System.out.println("1.Nhập danh sach");
            System.out.println("2.Xuất danh sách");
            System.out.println("3.Xuất DS ngẫu nhiên");
            System.out.println("4.Sắp xếp giảm dần và xuất DS");
            System.out.println("5.Tìm và xóa");
            System.out.println("6.kết thúc");
            System.out.println("Mời chọn:");
            chon = Integer.parseInt(_sc.nextLine());
            switch (chon) {
                case 1: {
                    nhapDS();
                    break;
                }
                case 2: {
                    xuatDS();
                    break;
                }
                case 3: {
                    xuatNgauNhienDS();
                    break;
                }
                case 4: {
                    sapXepGiamDanDS();
                    break;
                }
                case 5: {
                    timVaXoaDS();
                    break;
                }
                case 6: {
                    break;
                }
                default: {
                    System.out.println("Không tồn tại!!");
                    break;
                }
            }
        } while (chon != 6);
    }
}
