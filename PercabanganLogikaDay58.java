package Days;

import java.util.Scanner;

public class PercabanganLogikaDay57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan usia anda saat ini: ");
        int usia = scanner.nextInt();
        if(usia < 18){
            System.out.println("Usia anda belum dewasa");
        }else{
            System.out.println("Usia anda telah dewasa");
        }
    }
}
