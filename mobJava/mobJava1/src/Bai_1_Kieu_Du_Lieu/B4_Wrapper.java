/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_1_Kieu_Du_Lieu;

/**
 *
 * @author tuani
 */
public class B4_Wrapper {
    public static void main(String[] args) {
/*
    Lop bao- WRAPPER
    Tuong ung voi moi kieu nguyen thuy ==> co cac lop 3 tuong ung
        VD:
        - Kieu nguyen thuy ==> Kieu Wrapper
        - boolean ==> Boolean
        - byte ==> Byte
        - char ==> Charactec
        - short ==> Short
        - int ==> Innteger
        - long ==> Long
        - float ==> Float
        - double ==> Double
        */
/*
    Boxing ==> tao doi tuong de bao boc lay gia tri nguyen thuy
*/
Integer a= new Integer(5);//bao tuong minh
Integer b= Integer.valueOf(5);//bao tuong minh
Integer c=5;//bao ngam dinh


/*
Unboxing: Lay gia tri tu lop bao do
*/
int value =a.intValue();//Mo bao tuong minh
int result=b;//Mo bao ngam dinh

double d=0;
Double dou=null;
        System.out.println("double="+d);
        System.out.println("Double"+dou);
    }
}
