package Days;

import java.util.Scanner;

public class Day17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan sebuah karakter: ");
        char karakter = input.next().charAt(0);
        if(karakter >= 'A' && karakter <= 'Z'){
            System.out.println("Huruf Kapital");
        }else if  (karakter >= 'a' && karakter <= 'z'){
            System.out.println("Huruf kecil");
        }else{
            System.out.println("Bukan huruf");
        }
    }
    
}
