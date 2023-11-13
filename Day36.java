package Days;

import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Operasi aritmatika");
        
        System.out.println("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();
        
        System.out.println("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();
        
        System.out.println("Hasil penjumlahan: " + (angka1 + angka2));
        System.out.println("Hasil pengurangan: " + (angka1 - angka2));
        System.out.println("Hasil perkalian: " + (angka1 * angka2));
        System.out.println("Hasil pembagian: " + (angka1 / angka2));
        System.out.println("Hasil sisa bagi atau modulus: " + (angka1 % angka2));
    }
}
