
package Days;

import java.util.Scanner;

public class MenghitungPanjangNamaMenggunkanTipeDataLongDay47 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Masukkan nama anda: ");
        
        String nama = input.nextLine();
        long panjangNama = nama.length();
        System.out.println("Panjang nama anda adalah " + panjangNama + "huruf");
    }
}