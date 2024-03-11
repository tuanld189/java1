/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bing_Chilling;

/**
 *
 * @author tuani
 */
public class Bing_Chiling {
    private String noiSanXuat;
    private String vi;
    private int id;
    private double gia;
    // ctrl enter x2
    public Bing_Chiling() {
    }

    public Bing_Chiling(String noiSanXuat, String vi, int id, double gia) {
        this.noiSanXuat = noiSanXuat;
        this.vi = vi;
        this.id = id;
        this.gia = gia;
    }
//    chot phai inset code -> getter and setter
    public String getNoiSanXuat() {
        return noiSanXuat;
    }

    public void setNoiSanXuat(String noiSanXuat) {
        this.noiSanXuat = noiSanXuat;
    }

    public String getVi() {
        return vi;
    }

    public void setVi(String vi) {
        this.vi = vi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    // insetcode -> tostring
    @Override
    public String toString() {
        return "Bing_Chiling{" + "noiSanXuat=" + noiSanXuat + ", vi=" + vi + ", id=" + id + ", gia=" + gia + '}';
    }
    
            
            

}
