package Days;

import java.util.Scanner;

public class Day26 {

    public static void main(String[] args) {
        int nilaiSiswa = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai Siswa: ");
        nilaiSiswa = input.nextInt();
        if (nilaiSiswa <= 50) {
            System.out.println("Tinggal kelas");
        } else {
            System.out.println("Tidak tinggal kelas");
        }
    }
}
