package Days;

import java.util.Scanner;

public class Day22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan lebar: ");
        double alas = scanner.nextDouble();
        
        System.out.println("Masukkan tinggi: ");
        double tinggi = scanner.nextDouble();
        
        double luas = (alas*tinggi)/2;
        System.out.println("Luas segitiga adalah: "+luas);
    }
}
