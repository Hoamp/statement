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
public class soal2 {
    
    public static void main(String[] args) {
        int beli, diskon, harga_barang, bayar;
        Scanner ingput = new Scanner(System.in);
        
        harga_barang = 1000000;
        System.out.println("Harga barang = 1.000.000");
        System.out.println("Berapa pembelian anda");
        beli = ingput.nextInt();
        
        if(beli > 500000){
            diskon = 75000;
        }else if(beli > 300000){
            diskon = 50000;
        }else if(beli > 150000){
            diskon = 20000;
        }else if(beli > 100000){
            diskon = 10000;
        }else {
            diskon = 0;
        }
        
        
        bayar =  harga_barang - beli - diskon;
        System.out.println("Harga yang harus anda bayar adalah " + bayar + " dengan diskon " + diskon);
        
    }
}
