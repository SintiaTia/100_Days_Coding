package Days;

import java.util.Scanner;

public class Day29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan berat badan anda: (kg)");
        double beratBadan = scanner.nextDouble();
        if (beratBadan < 45.0) {
            System.out.println("Berat badan kurang");
        } else if (beratBadan >= 45.0) {
            System.out.println("Berat badan ideal atau normal");
        } else if (beratBadan >= 60.0 && beratBadan < 80.0) {
            System.out.println("Berat badan termasuk dalam kategori gemuk");
        } else {
            System.out.println("Berat badan anda terlalu berlebih.");
        }
    }
}
    
