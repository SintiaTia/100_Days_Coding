package Days;

import java.util.Scanner;

public class PenjumlahanTipeDataLongDay49 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        long bilangan1 = sc.nextLong();
        
        System.out.print("Masukkan bilangan: ");
        long bilangan2 = sc.nextLong();
        
        long hasilPenjumlahanDuaVariabel = bilangan1 + bilangan2;
        System.out.println("Hasil penjumlahan dari dua variabel bertipe data long adalah: " + hasilPenjumlahanDuaVariabel);
    }
}
