/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bing_Chilling;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tuani
 */
public class QL {

    Scanner _sc = new Scanner(System.in);
    List<Bing_Chiling> _lstBingChill;
    Bing_Chiling _bingChiling;
    String _input;

    //ctrl + enter
    public QL() {
        _lstBingChill = new ArrayList<>();
    }

    public void nhapDS() {
//        System.out.println("Nhap so luong Bing Chilling= ");
//        int n = Integer.parseInt(_sc.nextLine());
//        for (int i = 0; i < n; i++)

        String yesNo;
        do {
            _bingChiling = new Bing_Chiling();
            System.out.println("Nhap id= ");
            int id = Integer.parseInt(_sc.nextLine());
            _bingChiling.setId(id);
            System.out.println("Nhap gia= ");
            double gia = Double.parseDouble(_sc.nextLine());
            _bingChiling.setGia(gia);
            System.out.println("Nhap noi sx= ");
            String noiSanXuat = _sc.nextLine();
            _bingChiling.setNoiSanXuat(noiSanXuat);
            System.out.println("Nhap vi= ");
            String vi = _sc.nextLine();
            _bingChiling.setVi(vi);

            _lstBingChill.add(_bingChiling);
            System.out.println("Co muon tiep tuc khong yes/no (Y/N)");
            yesNo = _sc.nextLine();
            if (yesNo.equalsIgnoreCase("N")) {
                break;
            }
        } while (yesNo.equalsIgnoreCase("y"));
        //fomat code
    }

    public void xuatDS() {
        for (Bing_Chiling bing_Chiling : _lstBingChill) {
            System.out.println(bing_Chiling.toString());
        }
    }

    // ach dung for i
    public void timKiem() {
        System.out.println("Nhap id cam tim=");
        _input = _sc.nextLine();
        for (int i = 0; i < _lstBingChill.size(); i++) {
            if (_lstBingChill.get(i).getId() == Integer.parseInt(_input));
            System.out.println(_lstBingChill.get(i).toString());
            return;

        }
        System.out.println("khong tim thay bing chilling");
    }

    public void xoa() {
        System.out.println("Nhap id can xoa ");
        _input = _sc.nextLine();
        for (int i = 0; i < _lstBingChill.size(); i++) {
            if (_lstBingChill.get(i).getId() == Integer.parseInt(_input));
            System.out.println(_lstBingChill.get(i).toString());
            _lstBingChill.remove(i);
            System.out.println("xoa thanh cong");
            return;
        }
        System.out.println("Khong xoa thanh cong");
    }

    public void sua() {
        System.out.println("Nhap id can sua= ");
        _input = _sc.nextLine();
        for (int i = 0; i < _lstBingChill.size(); i++) {
            if (_lstBingChill.get(i).getId() == Integer.parseInt(_input));
            System.out.println("----1. gia; 2. noi sx; 3. vi----");
            System.out.println("chon thong tin can sua");
            int chon = Integer.parseInt(_sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("Nhap gia= ");
                    double gia = Double.parseDouble(_sc.nextLine());
                    _lstBingChill.get(i).setGia(gia);
                    break;
                case 2:
                    System.out.println("Nhap noi sx= ");
                    String noiSanXuat = _sc.nextLine();
                    _bingChiling.setNoiSanXuat(noiSanXuat);
                case 3:
                    System.out.println("Nhap vi= ");
                    String vi = _sc.nextLine();
                    _bingChiling.setVi(vi);

                default:
                    System.out.println("May nhap sai roi");
            }
            System.out.println("Sua thanh cong");
            return;
        }
        System.out.println("Khong xoa thanh cong");
    }
    public void sapXepTheoGia(){
        //dap xep theo gia
        System.out.println("Sap xep theo gia");
        Collections.sort(_lstBingChill,new Comparator<Bing_Chiling>() {
            @Override
            public int compare(Bing_Chiling o1, Bing_Chiling o2) {
               return o1.getGia() > o2.getGia() ? 1: -1; //sap xep tang dan
            }
        });
    }

}
