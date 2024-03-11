/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_7;

/**
 *
 * @author tuani
 */
public class Bai_2_SinhVienIT extends Bai_2_SinhVienPoly{
    private double diemJava;
    private double diemCss;
    private double diemHtml;

    public Bai_2_SinhVienIT(double diemJava, double diemCss, double diemHtml) {
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    public Bai_2_SinhVienIT(double diemJava, double diemCss, double diemHtml, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    @Override
    double getDiem(){
        return (2*diemJava+diemHtml+diemHtml)/4;
    }
    
    
    
    
}
