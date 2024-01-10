package Days;

import java.util.Scanner;

public class PercabanganDay94 {

    public static void main(String[] args) {
        System.out.print("Masukakan umur: ");
        Scanner input = new Scanner(System.in);
        int umur = input.nextInt();
        if (umur > 18){
             System.out.println("Anda boleh membeli tiket konser");
    }else{
            System.out.println("Maaf umur anda belum mencukupi untuk membeli tiket konser");
    }
  }
}
