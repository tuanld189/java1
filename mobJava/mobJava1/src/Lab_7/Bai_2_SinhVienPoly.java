/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_7;

/**
 *
 * @author tuani
 */
public abstract class Bai_2_SinhVienPoly {
    private String hoTen;
    private String nganh;

    public Bai_2_SinhVienPoly() {
    }

    public Bai_2_SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNganh() {
        return nganh;
    }
    abstract double getDiem();
    
    public String getHocLuc(){
        String hocLuc=null;
        double diem=getDiem();
        if (diem>=9){
            hocLuc="Xuat xac";
        }else if(diem>=7.5){
            hocLuc="Gioi";
        }else if(diem>=6.5){
            hocLuc="Kha";
        }else if(diem>=5){
            hocLuc="Trung binh";
        }else{
            hocLuc="Yeu";
        }
        return hocLuc;
    }
}
