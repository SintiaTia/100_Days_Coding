package Days;

import java.util.Scanner;

public class ShortDay93 {
    public static void main(String[] args) {
        System.out.print("Masukkan bilangan pertama bertipe data short: ");
        Scanner input = new Scanner(System.in);
        float short1 = input.nextFloat(); 
        
        System.out.print("Masukkan bilangan pertama bertipe data short: ");
        Scanner scanner = new Scanner(System.in);
        float short2 = scanner.nextFloat();
        
        float operasi = short1 * short2 + short1;
        System.out.println("Hasilnya adalah: " + operasi);
    }
}
