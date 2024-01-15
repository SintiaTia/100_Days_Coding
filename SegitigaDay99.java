package Days;

import java.util.Scanner;

public class SegitigaDay99 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi A: ");
        double sisiA = scanner.nextDouble();
        System.out.print("Masukkan panjang sisi B: ");
        double sisiB = scanner.nextDouble();
        System.out.print("Masukkan panjang sisi C: ");
        double sisiC = scanner.nextDouble();

        if (sisiA == sisiB && sisiB == sisiC) {
            System.out.println("Segitiga adalah equilateral.");
        } else if (sisiA == sisiB || sisiB == sisiC || sisiA == sisiC) {
            System.out.println("Segitiga adalah isosceles.");
        } else {
            System.out.println("Segitiga adalah scalene.");
        }
    }
}
