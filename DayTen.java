package Days;

import java.util.Scanner;

public class DayTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
         System.out.println("Masukkan sebuah angka: ");
         int angka = scanner.nextInt();
         for (int i = 0; i <=angka; i++) {
             if(i % 2 == 1);
             System.out.println(i);    
        }
    }
}
