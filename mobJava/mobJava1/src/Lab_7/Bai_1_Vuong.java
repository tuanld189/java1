/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_7;

/**
 *
 * @author tuani
 */
public class Bai_1_Vuong extends Bai_1_ChuNhat{
    public Bai_1_Vuong(double canh){
        super(canh, canh);
        double rong=canh;
    }
    
    public void xuat(){
        System.out.println("Dien tich HV la: "+getDienTich());
        System.out.println("Chu vi HV la: "+getChuVi());
    }
}
