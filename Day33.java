package Days;

import java.util.Scanner;

public class Day33 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah orang yang membayar uang kas kls: ");
        int orang = input.nextInt();
        int jumlahUangKas = 0;
        for (int i = 0; i < orang ; i++) {
            System.out.println("Masukkan jumlah uang yang dibayar " + (i+1)+": ");
            int uangYangDiBayar = input.nextInt();
            jumlahUangKas += uangYangDiBayar;
        }
        System.out.println("Total uang kas sekarang adalah: " + jumlahUangKas);
        }   
    }

