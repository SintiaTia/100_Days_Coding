package Days;

import java.util.Scanner;

public class JumlahDigitDay64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();
        int jumlahAngka = hitungJumlahDigit(angka);
        System.out.println("Jumlah digit dalam angka " + angka + " adalah " + jumlahAngka);
    }
    private static int hitungJumlahDigit (int angka){
        return String.valueOf(angka).length();
    }
}
