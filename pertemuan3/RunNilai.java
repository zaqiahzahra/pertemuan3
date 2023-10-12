/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author zaqiah ahmad
 */
public class RunNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MasterNilaiMahasiswa Nilai = new MasterNilaiMahasiswa();
    System.out.println("\t\tProgam Menghihitung Nilai Mahasiswa");
    
    Nilai.HitungNilai(99, "Siti zaqiah azahra",1030);
    System.out.println(Nilai.HiTungNilai(75, "Luna", 1036));
    MasterNilaiMahasiswa.HitungNiLAi(60, "marchel", 1023);
    System.out.println(MasterNilaiMahasiswa.HiTUNGNilai(10, "Robert", 1045));
       
    }
    
}
