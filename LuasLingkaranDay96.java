package Days;

import java.util.Scanner;

public class LuasLingkaranDay96 {
    public static void main(String[] args) {
        System.out.print("Masukkan jari-jari lingkaran: ");
        Scanner input = new Scanner(System.in);
        double Ily = input.nextDouble();
        
        double luas =  Math.PI*Math.pow(Ily,2);
        double keliling = 2*Math.PI*Ily;
        
        System.out.println("Luas Lingkaran: "+luas);
        System.out.println("Keliling lingkaran: "+keliling);
    }
}
