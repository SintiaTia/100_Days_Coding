package Days;

public class PenjumlahanArrayDay53 {
    public static void main(String[] args) {
        int[] angka = {2,9,4,3,5,1};
        int hasil = 0;
        for(int elemen : angka){
            hasil += elemen;
        }
        System.out.println("Hasil penjumlahan dari elemen pada Array diatas adalah: " + hasil);
    }
}
