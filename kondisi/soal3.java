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
public class soal3 {
    public static void main(String[] args) {
        Scanner ingput = new Scanner(System.in);
        String penumpang, kendaraan;
        
        System.out.println("Masukkan jumlah penumpang");
        penumpang = ingput.nextLine();
        
        switch(penumpang){
            case "1":
                kendaraan = "jalan";
                break;
            case "2":
                kendaraan = "motor";
                break;
            case "3":
                kendaraan = "bajaj";
                break;
            case "4":
                kendaraan = "mobil";
                break;
            default:
                kendaraan = "kapal";
                break;
        }
        
        System.out.println("Dengan jumlah penumpang " + penumpang + " maka akan menggunakan kendaraan " + kendaraan);
        
        
    }
}
