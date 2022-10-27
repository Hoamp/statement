/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kondisi;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class soal1 {
    public static void main(String[] args) {
        int hasil;
        Scanner nilai = new Scanner(System.in);
        
        System.out.println("Masukkan nilai anda");
        hasil = nilai.nextInt();
        
        if(hasil > 77){
            System.out.println("Anda lulus");
        } else {
            System.out.println("Anda tidak lulus");
        }
    }
}
