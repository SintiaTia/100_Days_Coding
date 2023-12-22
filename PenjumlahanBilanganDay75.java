package Days;

public class PenjumlahanBilanganDay75 {
    public static void main(String[] args) {
        int S = 50; 
        for (int i = 2; i <= 50; i += 2) {
            S += i;
        }
        System.out.println("Hasil penjumlahan dari bilangan genap hingga 50 adalah :" + S);
    }
}
