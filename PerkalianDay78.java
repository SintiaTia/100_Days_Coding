package Days;

import java.util.Scanner;

public class PerkalianDay78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(angka+"x"+i+"="+(angka*i));
        }
    }
}
