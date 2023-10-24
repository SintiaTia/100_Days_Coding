package Days;

import java.util.Scanner;

public class Day16 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        int m,n,start,end;
         System.out.println("Masukkan nilai m: ");
         m = sc.nextInt();
         System.out.println("Masukkan nilai n: ");
         n = sc.nextInt();
        
         if (m>n){
             start = n;
             end = m; 
        }else{
             start = m;
             end = n;
         }
         String proses = "";
         int jumlah = 0;
         for (int i = start+1;i<end; i++){
             if (i == start+1){
                 proses+=i;
             }else{
                 proses+=("+"+i);
             }
             jumlah+=i; 
         }
        System.out.println( proses + "=" + jumlah);
    }
}
