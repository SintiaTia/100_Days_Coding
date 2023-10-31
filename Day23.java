package Days;

import java.util.Scanner;

public class Day23 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan kata: ");
        String kata = scanner.nextLine();
        String[] karakter = kata.split("");
         System.out.println("Kata yang di pisahkan: ");
         for (String karakterKata : karakter) {
             System.out.println(karakterKata);
         }
    }
}
