package Days;

import java.util.Scanner;

public class Day30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan bilangan desimal ");
        double bilangan = scanner.nextDouble();
        if (bilangan < 50.0) {
            System.out.println("Lebih kecil dari 50.0");
        } else {
            System.out.println("Lebih besar dari 50.0");
        }
    }
}
