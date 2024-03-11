/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tuani
 */
public abstract class NhanVienHanhChinh {
	public String maNV;
	public String hoTen;
	public double luong;
        public String chucVu;
        ArrayList<NhanVienHanhChinh> _lstNV;

	public NhanVienHanhChinh () {
	}
        abstract public double getThuNhap();

    public NhanVienHanhChinh(String maNV, String hoTen, double luong, String chucVu) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
        this.chucVu = chucVu;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

	

    @Override
    public String toString() {
        return "NhanVienHanhChinh{" + "maNV=" + maNV + ", hoTen=" + hoTen + ", luong=" + luong + ", chucVu=" + chucVu + '}';
    }

	
	
	public void inThongTin(){
            System.out.println("Ma nhan vien: "+maNV);
            System.out.println("Ten nhan vien: "+hoTen);
            System.out.println("Luong nhan vien: "+luong);
            System.out.println("Chuc vu nhan vien: "+chucVu);
        }
        public void nhapThongTin(){
            Scanner sc=new Scanner(System.in);
            System.out.println("====THONG TIN NHAN VIEN====");
            System.out.println("Nhap ma nhan vien: ");
            this.maNV=sc.nextLine();
            System.out.println("Nhap ten nhan vien: ");
            this.hoTen=sc.nextLine();
            System.out.println("Nhap luong nhan vien: ");
            this.luong=Double.parseDouble(sc.nextLine());
            System.out.println("Nhap chuc vu nhan vien: ");
            
            this.chucVu=sc.nextLine();
            
            if(chucVu.equalsIgnoreCase("tiep thi")){
                Scanner _sc=new Scanner(System.in);
                System.out.println("Nhập doanh số: ");
                double doanhSo=Double.parseDouble(_sc.nextLine());
                System.out.println("Nhập phần trăm hoa hồng: ");
                double hoaHong=Double.parseDouble(_sc.nextLine());
                TiepThi _tiepThi = new TiepThi(doanhSo,hoaHong,maNV,hoTen,luong,chucVu);
                _lstNV.add(_tiepThi);
            }
            else if(chucVu.equalsIgnoreCase("truong phong")){
                Scanner _sc=new Scanner(System.in);
                System.out.println("Nhập lương trách nhiệm: ");
                double luongTN=Double.parseDouble(_sc.nextLine());
                NhanVienHanhChinh truongPhong= new TruongPhong(luongTN,maNV,hoTen,luong,chucVu);
                _lstNV.add((TruongPhong) truongPhong);
            }
            else if(chucVu.equalsIgnoreCase("nhan vien")){
                
            }
            
            
        }
	
	

}
