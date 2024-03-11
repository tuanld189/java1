/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_7;

/**
 *
 * @author tuani
 */
public class Bai_2_SinhVienBiz extends Bai_2_SinhVienPoly{
    private double diemMarketting;
    private double diemSales;

    public Bai_2_SinhVienBiz(double diemMarketting, double diemSales) {
        this.diemMarketting = diemMarketting;
        this.diemSales = diemSales;
    }

    public Bai_2_SinhVienBiz(double diemMarketting, double diemSales, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemMarketting = diemMarketting;
        this.diemSales = diemSales;
    }

    @Override
    double getDiem(){
        return (2*diemMarketting+diemSales)/3;
    }
    
    
}
