package Days;

import java.util.Scanner;

public class MenghitungBilanganGanjil_Day60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah angka: ");
        int angka = scanner.nextInt();
        
        int angka1 = 0;
        for (int i = 1; i <= angka; i += 2) {
            angka1 += 1;
        }
        System.out.println("Jumlah bilangan ganjil dari angka: " + angka + " adalah: " + angka1);
    }
}
