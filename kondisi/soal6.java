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
public class soal6 {
    public static void main(String[] args) {
        Scanner ingput = new Scanner(System.in);
        int jumlah, diskon = 0, harga = 0;
        double totalBayar, totalDiskon;
        
        System.out.println("Selamat datang di toko buku kami");
        System.out.println("Berapa buku yang akan anda pinjam");
        jumlah = ingput.nextInt();
        
        
        switch(jumlah){
            case 1:
                harga = 10000;
                diskon = 0;
                break;
            case 2:
                harga = 20000;
                diskon = 0;
                break;
            case 3:
                harga = 30000;
                diskon = 0;
                break;
            case 4:
                harga = 40000;
                diskon = 2500;
                break;
            case 5:
                harga = 50000;
                diskon = 5000;
                break;
            case 10:
                harga = 100000;
                diskon = 10000;
                break;
            default:
                System.out.println("Tidak ada dalam list kami");
                break;
        }
        
        
        totalBayar = harga - diskon;
        System.out.println("Yang harus anda bayar = " + totalBayar + "\ndengan diskon = " + diskon);
        
        
    }
}
