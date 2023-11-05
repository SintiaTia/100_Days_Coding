
package Days;

import java.util.Scanner;

public class Day28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan berat badan anda: (kg)");
        double beratBadan = scanner.nextDouble();
        if(beratBadan <= 45.0){
            System.out.println("Berat badan kurang");
        }else{
            System.out.println("Berat badan andaa sangat berlebih");
        }
            
    }
}
