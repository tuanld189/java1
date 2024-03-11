    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_8_Chuoi_BieuThucChinhQuy;

import java.util.Scanner;

/**
 *
 * @author tuani
 */
public class ChuoiService {
    Scanner _sc=new Scanner(System.in);
    String _input;
    public int checkInputNumber(){
        do{
            System.out.println("Nhap so nguyen n= ");
            _input=_sc.nextLine();
            
        }while (!_input.matches("\\d+"));//[0-9]+
        return Integer.parseInt(_input);
    }
    public String checkInputString(){
        do{
            System.out.println("Nhap ho ten: ");
            _input =_sc.nextLine();
        }while(!_input.matches("[a-zA-Z\\s]+"));
        return _input;
    }
    public String checkInputDate(){
        do{
            System.out.println("Nhap ngay sinh: ");
            _input =_sc.nextLine();
            //28/11/2022
        }while(!_input.matches("[\\d]{2}[-|/][\\d]{2}[-|/][\\d]{4}"));
        return _input;
    }
    
    //checkInputEmail
    public String checkInputEmail(){
        do{
            System.out.println("Nhap Email: "); 
            _input =_sc.nextLine();
            
        }while(!_input.matches("\\w+@\\w+\\.(\\w){3,5}+\\.(\\w){2,3}"));
        return _input;
    }
    
    
    //vietHoaChuCaiDauTien 
}
