package Days;

import java.util.Scanner;

public class Day24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan panjang dari persegi panjang yang ingin dihitung: ");
        double panjang = scanner.nextDouble();
        System.out.println("Masukkan lebar persegi panjang: ");
        double lebar = scanner.nextDouble();
        double luas = panjang * lebar;
        System.out.println("Luas dari persegi panjang adalah : " + luas);
    }
}
