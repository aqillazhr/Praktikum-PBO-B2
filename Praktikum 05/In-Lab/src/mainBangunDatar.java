/* Nama File    : MainBangunDatar.java
 * Deskripsi    : berisi pengaplikasian dari method class BangunDatar, Lingkaran, Persegi, dan juga Interface IResize
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 18 Maret 2026 */

public class MainBangunDatar {
    public static void main(String[] args) {
        // BangunDatar B1 = new BangunDatar(); --> ini tidak bisa (error) karena bangun datar adalah abstract, jadi gabisa diinstansiasi
        BangunDatar P1 = new Persegi(10.0, "Pink", "Navy");
        Persegi P2 = new Persegi(5.0, "hijau lumut", "biru elektrik");
        BangunDatar L1 = new Lingkaran(7.0, "sky blue", "coklat mahogany");
        Lingkaran L2 = new Lingkaran (14.0, "sky blue", "coklat mahogany");

        System.out.println("-----BANGUN DATAR 1-----");
        P1.printInfo();
        System.out.println("Luas: " + P1.getLuas());
        System.out.println("Keliling: " + P1.getKeliling());
        // System.out.println("Diagonal: " + P1.getDiagonal()); --> ini tidak bisa karena getDiagonal dimiliki oleh class Persegi, sedangkan P1 bertipe BangunDatar

        System.out.println("-----BANGUN DATAR 2-----");
        P2.printInfo();
        System.out.println("Luas: " + P2.getLuas());
        System.out.println("Keliling: " + P2.getKeliling());
        System.out.println("Diagonal: " + P2.getDiagonal());

        System.out.println("-----BANGUN DATAR 3-----");
        L1.printInfo();
        System.out.println("Luas: " + L1.getLuas());
        System.out.println("Keliling: " + L1.getKeliling());

        System.out.println("-----BANGUN DATAR 4-----");
        L2.printInfo();
        System.out.println("Luas: " + L2.getLuas());
        System.out.println("Keliling: " + L2.getKeliling());

        //perbandingan luas dan keliling
        System.out.println("-----PERBANDINGAN LUAS-----");
        System.out.println("Apakah luas P1 sama dengan L1? ");
        System.out.println(P1.isEqualLuas(L1));
        System.out.println("Apakah luas P2 sama dengan L2? ");
        System.out.println(P2.isEqualLuas(L2));
        System.out.println("Apakah luas P2 sama dengan L1? ");
        System.out.println(P2.isEqualLuas(L1));
        System.out.println("Apakah luas P2 sama dengan L2? ");
        System.out.println(P1.isEqualLuas(L2));

        System.out.println("-----PERBANDINGAN KELILING-----");
        System.out.println("Apakah keliling P1 sama dengan L1? ");
        System.out.println(P1.isEqualKeliling(L1));
        System.out.println("Apakah keliling P2 sama dengan L2? ");
        System.out.println(P2.isEqualKeliling(L2));
        System.out.println("Apakah keliling P2 sama dengan L1? ");
        System.out.println(P2.isEqualKeliling(L1));
        System.out.println("Apakah keliling P2 sama dengan L2? ");
        System.out.println(P1.isEqualKeliling(L2));

        //penerapan Interface IResize
        System.out.println("-----zoomIn-----");
        System.out.println("Jari-jari L2: " + L2.getJari());
        L2.zoomIn();
        System.out.println("Setelah zoomIn ");
        System.out.println("Jari-jari L2: " + L2.getJari());

        System.out.println("-----zoomOut-----");
        System.out.println("Sisi P2: " + P2.getSisi());
        P2.zoomOut();
        System.out.println("Setelah zoomOut ");
        System.out.println("Sisi P2: " + P2.getSisi());

        System.out.println("-----zoom-----");
        System.out.println("Sisi P2: " + P2.getSisi());
        P2.zoom(300);
        System.out.println("Setelah zoom ");
        System.out.println("Sisi P2: " + P2.getSisi());
    }
}
