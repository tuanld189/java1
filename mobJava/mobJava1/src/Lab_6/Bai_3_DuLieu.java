/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_6;

/**
 *
 * @author tuani
 */
public class Bai_3_DuLieu {
    public Boolean email(String str){
        String pattern="\\w+@\\w+(\\.\\w+){1,2}";
        return str.matches(pattern);
    }
    public Boolean soDienThoai(String str){
        String pattern = "0\\d{8}";
        return str.matches(pattern);
    }
    public Boolean CMND(String str){
        String pattern="\\d{10}";
        return str.matches(pattern);
    }
}
