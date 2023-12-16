package Days;

import java.util.Scanner;

public class MenentukanKarakterHurufDay69 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
        System.out.print("Masukka sebuah huruf: ");
        char ch = scanner.next().charAt(0);
        
         if (ch == 'a' || ch == 'i' || ch == 'u' || ch == 'e' || ch == 'o' ||
            ch == 'A' || ch == 'I' || ch == 'U' || ch == 'E' || ch == 'O') {
            System.out.println(ch + " adalah huruf vokal.");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'z')) {
            System.out.println(ch + " adalah huruf konsonan.");
        } else {
            System.out.println(ch + " bukan huruf.");
        }    
    }
}
