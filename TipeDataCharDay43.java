package Days;

import java.util.Scanner;

public class TipeDataCharDay43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan karakter sebuah: ");
        char karakter = input.next().charAt(0);
        if (Character.isDigit(karakter)) {
            System.out.println("Karakter ini adalah digit");
        }else{
                System.out.println("Karakter ini bukan digit");
                }
    }
}
