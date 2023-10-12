/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author zaqiah ahmad
 */
public class runBangunDatar {
  public static void main(String[] args) {
      
      MasterBangunDatar F = new MasterBangunDatar();
      F.LuasJajarGenjang(10,12);
      System.out.println("Luas jajar genjang=" + F.LuasJajarGenjang(10,12));
      MasterBangunDatar.jajargenjang(10, 12);
      System.out.println("Luas jajargenjang=" + MasterBangunDatar.Jajargenjang(10,12));
  }
}
