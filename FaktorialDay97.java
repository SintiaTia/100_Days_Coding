package Days;

import java.util.Scanner;

public class FaktorialDay97 {
    public static void main(String[] args) {
            System.out.print("Masukkan bilangan bulat: ");
            Scanner input = new Scanner(System.in);
            int bilangan = input.nextInt();
            int faktorial = 1;
            for (int i = 1; i < bilangan; i++) {
                faktorial *=1;
        }
            System.out.println("FAktorial dari bilangan diatas adalah: " + bilangan + faktorial);
    }
}
