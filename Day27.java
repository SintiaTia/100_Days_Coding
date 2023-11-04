package Days;

import java.util.Scanner;

public class Day27 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int perkalian = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            int hasil = perkalian * i;
            System.out.println(perkalian + "x" + i + "=" + hasil);
        }
    }
}
