package Days;

import java.util.Scanner;

public class PercabanganJamDay59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan waktu dalam format 24 jam misal 20:56: "); //Meminta pengguna memasukkan format waktu 24 jam
        String jam = scanner.nextLine();
        String[] waktuArray = jam.split(":");//memecah waktu menjadi jam dan menit 
        int jamHariIni = Integer.parseInt(waktuArray[0]);
        if (jamHariIni >= 0 && jamHariIni < 12) { //menantukan waktu dan menampilkan pesan sesuai yang diinginkan
            System.out.println("Selamat pagi, semoga hari anda menyenangkan:)");
        } else if (jamHariIni >= 12 && jamHariIni < 18) {
            System.out.println("Selamat siang, dan tetap semangat menjalani hari:)");
        } else if (jamHariIni >= 18 && jamHariIni < 24) {
            System.out.println("Selamat malam, selamat beritirahat:)");
        } else {
            System.out.println("Format waktu yang anda masukkan salah.");
        }
    }
}
