package Days;

import java.util.Scanner;

public class PercabanganDay57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Masukkan angka pertama: ");
        double angkaPertama = scanner.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double angkaKedua = scanner.nextDouble();
        
        if(angkaPertama > angkaKedua){
            System.out.println("Angka pertama lebih besar");
        }else if(angkaPertama < angkaKedua){
            System.out.println("Angka Kedua lebih besar");
        }else{
            System.out.println("Kedua angkanya mempunyai nilai yang sama");
        }
    }
}
