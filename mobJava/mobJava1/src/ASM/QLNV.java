/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author tuani
 */
public class QLNV {

    Scanner _sc = new Scanner(System.in);
    ArrayList<NhanVienHanhChinh> _lstNhanVienHanhChin;
    NhanVienHanhChinh _nhanvienhanhchinh;
    String _input;

    public QLNV() {
        _lstNhanVienHanhChin = new ArrayList<>();
        _nhanvienhanhchinh = new NhanVienHanhChinh() {
            @Override
            public double getThuNhap() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
    }

    public void menu() {
        int chon = 0;
        do {
            System.out.println("====YEU CAU====");
            System.out.println("1. Nhap danh sach sinh vien tu ban phim.");
            System.out.println("2. Xuat danh sach nhan vien ra man hinh.");
            System.out.println("3. Tim va hien thi nhan vien theo ma nhap tu ban phim.");
            System.out.println("4. Xoa nhan vien theo ma nhap tu ban phim.");
            System.out.println("5. Cap nhat thong tin nhan vien theo ma nha tu ban phim");
            System.out.println("6. Tim cac nhan vien theo khoang luong nhap tu ban phim.");
            System.out.println("7. Sap xep nhan vien theo ho va ten.");
            System.out.println("8. Sap xep nhan vien theo thu nhap.");
            System.out.println("9. Xuat 5 nhan vien co thue thu nhap cao nhat.");
            System.out.println("Moi chon tu 1-9:  ");
            System.out.println("==================");
            chon = Integer.parseInt(_sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("1. Nhập danh sách nhân viên từ bàn phím.");
                    nhapDSNV();
                    break;
                case 2:
                    System.out.println("2. Xuất danh sách nhân viên ra màn hình.");
                    xuatDSNV();
                    break;
                case 3:
                    System.out.println("3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím");
                    timNV();
                    break;
                case 4:
                    System.out.println("4. Xóa nhân viên theo mã nhập từ bàn phím.");
                    xoaNV();
                    break;
                case 5:
                    System.out.println("5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím");
                    capNhatNV();
                    break;
                case 6:
                    System.out.println("6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím.");
                    timTheoLuong();
                    break;
                case 7:
                    System.out.println("7. Sắp xếp nhân viên theo họ và tên.");
                    sapXepNV();
                    break;
                case 8:
                    System.out.println("8. Sắp xếp nhân viên theo thu nhập.");
                    sapXepThuNhap();
                    break;
                case 9:
                    System.out.println("9. Xuất 5 nhân viên có thuế thu nhập cao nhất.");
                    
                    break;

                default:
                    System.out.println("Nap lai chuc nang!!!!");
            }
        } while (chon != 0);
    }

    public void nhapDSNV() {
        String yesNo;
        do {
            //1.Khoi tao doi tuong
            _nhanvienhanhchinh = new NhanVienHanhChinh() {
                @Override
                public double getThuNhap() {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }
            };
            //2.Nhap thong tin
            _nhanvienhanhchinh.nhapThongTin();
            //3.Them vao danh sach
            _lstNhanVienHanhChin.add(_nhanvienhanhchinh);

            System.out.println("Cp tiep tuc hay khong (y/n)");
            yesNo = _sc.nextLine();
        } while (yesNo.equalsIgnoreCase("Y"));
    }

    public void xuatDSNV() {
        System.out.println("====DANH SACH NHAN VIEN====");
        for (NhanVienHanhChinh nhanVienHanhChinh : _lstNhanVienHanhChin) {
            nhanVienHanhChinh.inThongTin();
        }
    }

    public void timNV() {
        System.out.println("Nhap ma NV can tim: ");
        String input = _sc.nextLine();
        int count = 0;
        for (int i = 0; i < _lstNhanVienHanhChin.size(); i++) {
            if (_lstNhanVienHanhChin.get(i).getMaNV().equalsIgnoreCase(input)) {
                System.out.println("Thong tin NV can tim la: ");
                System.out.println(_lstNhanVienHanhChin.get(i).getMaNV());
                System.out.println(_lstNhanVienHanhChin.get(i).toString());
                count++;

                break;
            }
        }
        if (count == 0) {
            System.out.println("Khong tim duoc NV!");
        }

    }

    public void xoaNV() {
        System.out.println("Nhap ma NV can xoa");
        String input = _sc.nextLine();
        int count = 0;
        for (int i = 0; i < _lstNhanVienHanhChin.size(); i++) {
            if (_lstNhanVienHanhChin.get(i).getMaNV().equalsIgnoreCase(input)) {
                System.out.println("Thong tin NV can tim la: ");
                System.out.println(_lstNhanVienHanhChin.get(i).getMaNV());
                System.out.println(_lstNhanVienHanhChin.get(i).toString());
                count++;

                //xoa
                _lstNhanVienHanhChin.remove(i);
                break;
            }
        }
        if (count == 0) {
            System.out.println("Khong xoa duoc NV!");

        }
    }

    public void capNhatNV() {
        int count = 0;
        System.out.println("Nhap ma nv can sua: ");
        _input = _sc.nextLine();
        for (int i = 0; i < _lstNhanVienHanhChin.size(); i++) {
            if (_lstNhanVienHanhChin.get(i).getMaNV().equalsIgnoreCase(_input)) {
                System.out.println("-------------Thong tin can sua------------");
                System.out.println("-1.Ho ten");
                System.out.println("-2.Luong");
                System.out.println("-3.Chuc vu");
                System.out.println("------------------------------------------");
                System.out.println("Nhap 1-3 can sua");
                int chon = Integer.parseInt(_sc.nextLine());
                switch (chon) {
                    case 1:
                        System.out.println("Nhap ten moi:");
                        String hoTen = _sc.nextLine();
                        _lstNhanVienHanhChin.get(i).setHoTen(hoTen);
                        count++;
                        break;
                    case 2:
                        System.out.println("Nhap luong moi");
                        int luong = Integer.parseInt(_sc.nextLine());
                        _lstNhanVienHanhChin.get(i).setLuong(luong);
                        count++;
                        break;
                    case 3: {
                        System.out.println("Nhap chuc vu moi:");
                        String chucVu = _sc.nextLine();
                        _lstNhanVienHanhChin.get(i).setChucVu(chucVu);
                        count++;
                        break;
                    }
                    default:
                        System.out.println("Nhap lai");
                }
            }
        }
        if (count == 0) {
            System.out.println("khong sua duoc!");
        }
    }

    public void timTheoLuong() {
        System.out.println("Nhap khoang luong nhan vien can tim: ");
        double luong1 = Double.parseDouble(_sc.nextLine());
        double luong2 = Double.parseDouble(_sc.nextLine());
        for (NhanVienHanhChinh nhanVien : _lstNhanVienHanhChin) {
            if (nhanVien.getThuNhap() >= luong1 && nhanVien.getThuNhap() <= luong2) {
                System.out.println("Nhan vien can tim: ");
                System.out.printf(" Ma nhan vien: %s || Ten nhan vien: %s || Luong: %f || chuc vu: %s \n", nhanVien.getMaNV(), nhanVien.getHoTen(), nhanVien.getThuNhap(), nhanVien.getChucVu());
            }
            return;
        }
        System.out.println("Khong tim thay nhan vien!!");
    }

    public void sapXepNV() {
        Collections.sort(_lstNhanVienHanhChin, new Comparator<NhanVienHanhChinh>() {
            @Override
            public int compare(NhanVienHanhChinh o1, NhanVienHanhChinh o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        });
    }

    public void sapXepThuNhap() {
        Collections.sort(_lstNhanVienHanhChin, new Comparator<NhanVienHanhChinh>() {
            @Override
            public int compare(NhanVienHanhChinh o1, NhanVienHanhChinh o2) {
                return o1.getThuNhap() > o2.getThuNhap() ? 1 : -1;
            }
        });
    }
}
