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
public class soal4 {
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        String kis, wargaSetempat, kewarganegaraan, ya = "ya", bukanWargaSetempat;
        int bayar = 0;
        
        System.out.println("Jawab ya jika anda punya, selannya akan dianggap tidak punya");
        System.out.println("Apakah anda punya KIS ?");
        kis = masukkan.nextLine();
        
        System.out.println("Apakah anda warga setempat");
        wargaSetempat = masukkan.nextLine();
        
        System.out.println("Apakah anda bukan warga setempat");
        bukanWargaSetempat = masukkan.nextLine();
        
        System.out.println("Apakah anda tidak punya kewarganegaraan");
        kewarganegaraan = masukkan.nextLine();
        
        
        if(kis.equals(ya)) {
            bayar = 0;
        } else if(wargaSetempat.equals(ya)){
            bayar = 75000;
        } else if(bukanWargaSetempat.equals(ya)){
            bayar = 100000;
        } else if(kewarganegaraan.equals(ya)){
            bayar = 12;
        }
        
        if(bayar == 12){
            System.out.println("Anda tidak boleh berobat");
        } else {
            System.out.println("Yang harus anda bayar : " + bayar);  
        }
        
        
        
        
    }
}
