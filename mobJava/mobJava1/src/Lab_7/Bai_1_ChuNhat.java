/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_7;

/**
 *
 * @author tuani
 */
public class Bai_1_ChuNhat {
    private double dai;
    private double rong;

    public Bai_1_ChuNhat() {
    }

    public Bai_1_ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getChuVi() {
        return (dai +rong)*2;
    }

    public double getDienTich() {
        return dai*rong;
    }
    
    public void xuat(){
        System.out.println("Dien tich HCN la: "+getDienTich());
        System.out.println("Chu vi HCN la: "+getChuVi());
    }
    
    
    
}
