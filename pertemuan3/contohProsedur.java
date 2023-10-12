/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author zaqiah ahmad
 */
public class contohProsedur {
    int alas = 20;
    int tinggi = 30;
    
    void hitungLuasJajarGenjang(){
        int luas = alas * tinggi;
        System.out.println("alas=" + alas);
        System.out.println("tinggi=" + tinggi);
        System.out.println("LuasJajarGenjang=" + luas);
    }
    public static void main(String[] args){
        contohProsedur p = new contohProsedur();
        p.hitungLuasJajarGenjang();
    }
}
