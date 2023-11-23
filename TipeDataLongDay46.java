package Days;
    
import java.util.Scanner;

public class TipeDataLongDay46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tahun lahir anda: ");
        long tahunSaatIni = 2023;
        long tahunLahir = scanner.nextLong();
        long usiaSaatIni = tahunLahir - tahunSaatIni;
        System.out.println("Usia anda saat ini adalah " + usiaSaatIni + "tahun");
        
    }
    
}

//Buatlah program Java yang meminta pengguna untuk memasukkan tahun kelahiran mereka dan 
//kemudian menghitung dan menampilkan usia mereka menggunakan tipe data long.