package Days;

import java.util.Scanner;

public class PenggunaanIfElseDay44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bilangan = scanner.nextInt();
        if(bilangan % 2 == 0){
            System.out.print(bilangan + " adalah bilangan genap");
        }else{
            System.out.print(bilangan + " adalah bilangan ganjil");
        }
        System.out.println();
    }
}
