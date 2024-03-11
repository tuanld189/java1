/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_1_Kieu_Du_Lieu;

/**
 *
 * @author tuani
 */
public class B2_KhaiBaoBien {
/*
    1. Khai báo biến:
    - <Kiểu dữ liệu> <Tên biến>;
    - <Tên biến> = <Giá trị>;
    - <Kiểu dữ liệu> <Tên biến> = <Giá trị>;
    - <Kiểu dữ liệu> <Tên biến>, <Tên biếm>, <Tên biến>;
    2. Quy tắc đặt tên biến:
    C1: normal: fistname
    C2: camel case: fistName ==> SinhVien (pascal case)
    C3: under_code: fist_name
    ***Lưu ý: Tên biến không bắt đầu bằng số, đấu gạch ngang, không dược trùng với kayword
    3. Biến toàn cục và biến cục bộ:
    *Biến toàn cục: Khai báo biên ngoài phương thức
    ==> Bắt buộc khai báo có dấu gachj dưới "_" trước tên biến
    VD: _fistName
    *Biến cục bộ:
    - Khai báo biến trong phương thức
    */    
 static int _bienToanCuc;
    
    public static void main(String[] args) {
        System.out.println("Đây là cách khai báo biến:");
        int bienToanBo;
        double score = 9.5;
        _bienToanCuc = 5;
    }
}
