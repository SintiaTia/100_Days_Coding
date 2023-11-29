package Days;

public class WarnaArrayDay52 {
    public static void main(String[] args) {
        String[] warna = {"merah", "biru", "hijau", "kuning", "merah"};
        warna[0] = "putih";
        System.out.print("Array setelah perubahan: ");
        for (String elemen : warna) {
            System.out.print(elemen + " ");
        }
        System.out.println();
    }
}
