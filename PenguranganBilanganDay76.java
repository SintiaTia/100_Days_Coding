package Days;

public class PenguranganBilanganDay76 {
    public static void main(String[] args) {
        int a = 50;
        for (int i = 1; i <= 50; i+=2) {
            a -= i;
            System.out.print(i+" ");
        }
        System.out.println("Hasil pengurangan dari bilangan ganjil hingga 50 adalah :" + a);
    }
}
