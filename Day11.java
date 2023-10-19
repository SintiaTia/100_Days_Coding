package Days;

import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
         System.out.println("Masukkan sebuah angka: ");
         int angka = scanner.nextInt();
         for (int i = 1; i <= 10; i++) {
             int hasil = angka * i;
             System.out.println(angka + "x" + i + "=" + hasil);    
        }
    }
}
