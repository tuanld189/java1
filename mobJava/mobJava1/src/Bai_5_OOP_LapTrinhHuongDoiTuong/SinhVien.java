/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_5_OOP_LapTrinhHuongDoiTuong;

/**
 *
 * @author tuani
 */
public class SinhVien {
    //1. THUỘC TÍNH
    //private tất cả các thuộc tính của SinhVien
    private String msv;
    private String hoTen;
    private int namSinh;
    private double diem;

    //2. CONSTRUCTOR
    //2. Constructor: 2 loại Constructor
    /*
    - Tên Constructor phải giống với tên class và có từ khóa public
    - Khi khởi tạo đối tượn thì Constructor luôn là thành phần chạy đầu tiên 
    trong class đối tượng đó
        + Constructor không tham số dùng để khởi tạo đối tượng không có giá trị ban đầu
        + Constructor có tham số để khởi tạo đối tượng có ngay giá trị
    - Nếu khi khở tạo đối tượng mà đối tượng không có constructor nào thì chương trình sẽ tự động
    khởi tạo cho đối tượng đó 1 constructor mặc định, đó là constructor không tham số.
        //- 1. (ctrl +cách+ Enter) x2
        //- 2. Click chuột phải => Insert Code => Constructor
    */
    //2.1 Constructor không tham số
    public SinhVien() {
    }

    //2.2 Constructor full tham số
    public SinhVien(String msv, String hoTen, int namSinh, double diem) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diem = diem;
    }

    //GETTER & SETTER
    //để đọc ghi các trường bị che dấu do thuộc tính bị private
    //Click chuột phải => Insert Code => Getter and Setter
    //Select All => Generate
    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    //4. toString()
    //Click chuột phải => Insert Code => toString() => Generate
    @Override
    public String toString() {
        return "SinhVien{" + "msv=" + msv + ", hoTen=" + hoTen + ", namSinh=" + namSinh + ", diem=" + diem + '}';
    }

    public void inThongTin() {
        System.out.println("====================");
        System.out.println("THONG TIN SINH VIEN");
        System.out.println("MSV= " + msv);
        System.out.println("Ho va ten= " + hoTen);
        System.out.println("Nam sinh= " + namSinh);
        System.out.println("Diem= " + diem);
        System.out.println("====================");
    }
}
