package Days;

import java.util.Scanner;

public class Day31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Masukkan nilai Mahasiswa"); 
        float nilaiMahasiswa = scanner.nextFloat(); 
        if (nilaiMahasiswa >= 80.0) { 
            System.out.println("Nilai A");
        } else if (nilaiMahasiswa >= 70.0) {
            System.out.println("Nilai B");
        } else if (nilaiMahasiswa >= 60.0) {
            System.out.println("Nilai C");
        } else if (nilaiMahasiswa >= 50.0) {
            System.out.println("Nilai D");
        } else {
            System.out.println("Nilai E");
        }
    }
}
