package Days;

import java.util.Scanner;

public class Day32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan");
        int a = input.nextInt();
        for (int k = 1; k <= a; k++) {
            for (int l = 1; l <= a; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
