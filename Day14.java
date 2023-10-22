package Days;

import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan bilangan yang anda inginkan: ");
        int a = scanner.nextInt();
        if(a %2 == 0){
            System.out.println("Bilangan genap");
        }else{
            System.out.println("Bilangan ganjil");
        }
    }
}
