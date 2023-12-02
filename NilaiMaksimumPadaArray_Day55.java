package Days;

public class NilaiMaksimumPadaArray_Day55 {
    public static void main(String[] args) {
        int[] angka = {34, 89, 45, 37, 90,190};
        int angka1 = angka[0];
        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > angka1) {
                angka1 = angka[i];
            }
        }
        System.out.println("Nilai maksimum dari aray diatas adalah: " + angka1);
    }
}
