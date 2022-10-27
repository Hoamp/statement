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
public class soal5 {
    public static void main(String[] args) {
        Scanner ingput = new Scanner(System.in);
        String hasil;
        int umur;
        
        System.out.println("Selamat datang di bioskop kami");
        System.out.println("Berapa umur anda");
        umur = ingput.nextInt();
        
        if(umur < 15){
            hasil = "upin-ipin";
        } else if(umur < 25){
            hasil = "spiderman";
        } else {
            hasil = "g30s/pki";
        }
        
        switch(hasil){
            case "upin-ipin":
                System.out.println("Anda akan menonton = " + hasil);
                break;
            case "spiderman":
                System.out.println("Anda akan menonton = " + hasil);
                break;
            case "g30s/pki":
                System.out.println("Anda akan menonton = " + hasil);
                break;
            default:
                System.out.println("Umur anda kok gitu");
                break;
        }
        
        
        
    }
}
