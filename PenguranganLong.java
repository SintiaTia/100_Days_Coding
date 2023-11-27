package Days;

import java.util.Scanner;

public class PenguranganLong {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Masukkan bilangan long: ");
         long bilangan = input.nextLong();
         
         System.out.print("Masukan bilangan long: ");
         long bilangan1 = input.nextLong();
         
         long hasil = bilangan - bilangan1;
         System.out.println("Pengurangan dari dua bilangan diatas adalah: " + hasil);
    }
}
