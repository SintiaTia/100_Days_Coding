package Days;

import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan kata: ");
        String kata = scanner.nextLine();
        String reversedKata = "";
        for (int i = kata.length() - 1; i>= 0; i--) {
            reversedKata += kata.charAt(i);
        }
        System.out.println("Kata asli: "+kata);
        System.out.println("Kata terbalik: "+reversedKata);
    }
}
