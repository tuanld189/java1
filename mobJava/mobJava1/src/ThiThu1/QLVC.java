/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThiThu1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tuani
 */
public class QLVC {

    Scanner _sc = new Scanner(System.in);
    ArrayList<Vaccine> _lstvaccine;
    Vaccine _vaccine;
    String _input;

    public QLVC() {
        _lstvaccine = new ArrayList<>();
        _vaccine = new Vaccine();

    }

    public void nhapVC() {
        String yesNo;
        do {
            _vaccine=new Vaccine();
            System.out.println("Nhập mã vaccine: ");
            String MaVC = _sc.nextLine();
            _vaccine.setMaVC(MaVC);
            System.out.println("Nhập tên vaccine: ");
            String TenVC = _sc.nextLine();
            _vaccine.setTenVC(TenVC);
            System.out.println("Nhập thời gian tác dụng: ");
            float ThoiGianTacDung = Float.parseFloat(_sc.nextLine());
            _vaccine.setThoiGianTacDung(ThoiGianTacDung);
            System.out.println("Nhập ngày hết han: ");
            String NgayHetHan = _sc.nextLine();
            _vaccine.setNgayHetHan(NgayHetHan);
            _lstvaccine.add(_vaccine);
            System.out.println("Có muốn tiếp tục Yes/No (Y/N)?");
            yesNo = _sc.nextLine();

        } while (yesNo.equalsIgnoreCase("Y"));
    }

    public void xuatVC() {
        for (Vaccine vaccine : _lstvaccine) {
            vaccine.inThongTin();
        }
    }

    public void xuatvc6Thang() {
        for (int i = 0; i < _lstvaccine.size(); i++) {
            if (_lstvaccine.get(i).getThoiGianTacDung() >= 6) {
                System.out.println(_lstvaccine.get(i).toString());
            }
        }
    }

    ;
    public void sapxep() {
        System.out.println("Sắp xếp giảm dần rheo thời gian tác dụng");
        Collections.sort(_lstvaccine, new Comparator<Vaccine>() {
            @Override
            public int compare(Vaccine o1, Vaccine o2) {
                return o1.getThoiGianTacDung() < o2.getThoiGianTacDung() ? 1 : -1;
            }
        });
    }
}
