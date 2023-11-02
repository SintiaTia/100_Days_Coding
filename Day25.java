package Days;

import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
       int praktikum = 0;
       Scanner input = new Scanner(System.in);
        System.out.println("Berapa kali gagal praktikum: ");
        praktikum = input.nextInt();
        if(praktikum >= 5){
            System.out.println("Tidak ada kesempatan lagi");
        }else{
            System.out.println("Masih punya kesempatan, manfaatkan sebaik-baiknya");
        }
        System.out.println("SEMANGAT YAAA HEHE");
    }
}
