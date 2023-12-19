package Days;

import java.util.Scanner;

public class TinggiBadanDay72 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tinggi badan wanita: ");

        double tinggi = scanner.nextDouble();
        if (tinggi < 155) {
            System.out.println("Perlu menambah tinggi badan");
        }else if(tinggi > 155){
            System.out.println("Ideal");
        }
    }
}
