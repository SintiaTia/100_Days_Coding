package Days;

public class TipeDataLongDay45 {
    public static void main(String[] args) {
        int detikPerJam = 60;
        int menitPerJam = 60;
        int jamPerHari = 24;
        long detikPerHari = (long) detikPerJam * menitPerJam * jamPerHari;
        System.out.println("Jumlah detik perhari adalah: " + detikPerHari);
    
    }
}
