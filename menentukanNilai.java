package Days;

import java.util.Scanner;

public class menentukanNilai {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();
        
        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();
        
        if (angka1 > angka2) {
            System.out.println(angka1 + " lebih besar dari " + angka2);
            System.out.println(angka2 + " lebih kecil dari " + angka1);
        } else if (angka1 < angka2) {
            System.out.println(angka1 + " lebih kecil dari " + angka2);
            System.out.println(angka2 + " lebih besar dari " + angka1);
        } else {
            System.out.println("Kedua bilangan sama besar, yaitu " + angka1);
        }
    }
}
