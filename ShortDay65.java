package Days;

import java.util.Scanner;

public class ShortDay65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Masukkan angka pertama: ");
        short angka1 = scanner.nextShort();
        
        System.out.print("Masukkan angka kedua: ");
        short angka2 = scanner.nextShort();
        
        short pengurangan = (short) (angka1-angka2);
        
        System.out.println("Pengurangan dari kedua angka diatas adalah: " + pengurangan);
    }
}
