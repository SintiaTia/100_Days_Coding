
package Days;

import java.util.Scanner;

public class FloatDay92 {
    public static void main(String[] args) {
        System.out.print("Masukan bilangan bertipe data float: ");
        Scanner scanner = new Scanner(System.in);
        float bilangan1 = scanner.nextFloat();
        
        System.out.print("Masukan bilangan bertipe data float: ");
        Scanner input = new Scanner(System.in);
        float bilangan2 = input.nextFloat();
        
        float operasi = bilangan1 - bilangan2;
        System.out.println("Hasil pengurangan antar 2 bilangan adalah: " + operasi);
    }
}
