package Days;

public class HurufDalamArray_Day56 {
    public static void main(String[] args) {
        char[] huruf = {'U', 'Y', 'A', 'A', 'I', 'T', 'N', 'I', 'S'};
        System.out.println("Elemen yang terbalik pada Array: ");
        for (int i = huruf.length -1; i >= 0; i--) {
            System.out.println(huruf[i]+" ");
        }
    }
}
