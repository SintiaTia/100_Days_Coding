package Days;

import java.util.Scanner;

public class NilaiDay98 {
    public static void main(String[] args) {
        System.out.print("Masukkan angka: ");
        Scanner input = new Scanner(System.in);
        int bilangan = input.nextInt();
        if(bilangan > 0) {
            System.out.println("Angka " + bilangan + " adalah positif");
        } else if (bilangan < 0) {
            System.out.println("Angka " + bilangan + " adalah negatif");
        } else {
            System.out.println("Angka " + bilangan + " adalah nol");
        }
    }
}
