package Days;

import java.util.Scanner;

public class MenghitungBilanganGenap_Day61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();
        int jumlah = 0;
        System.out.println("Jumlah bilangan genap dari angka " + angka + " adalah");
        for (int i = 2; i <= angka; i+=2) {
            jumlah += 1;
             System.out.print(i+" ");
        }
        System.out.println("Jumlah bilangan genap dari angka " + angka + " adalah " + jumlah + " angka ");
    }
}
