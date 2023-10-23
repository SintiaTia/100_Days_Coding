package Days;

import java.util.Scanner;

public class Day15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan angka apa saja: ");
        int j = scanner.nextInt();
        if (j >0 ){
            System.out.println("Adalah bilangan positif");
        }else if(j < 0){
            System.out.println("Adalah bilangan negatif");
        }else{
            System.out.println("Nol");
        }
        
    }
}
