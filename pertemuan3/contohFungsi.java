/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author zaqiah ahmad
 */
 public class contohFungsi {
    int alas = 10;
    int tinggi= 5;
    
 int hitungLuasJajarGenjang(){
 int luas = alas * tinggi;
 return luas;
 }
 public static void main (String[] args){
     contohFungsi F= new contohFungsi();
     System.out.println("Luasjajar genjang=" + F.hitungLuasJajarGenjang());
 }
 }
