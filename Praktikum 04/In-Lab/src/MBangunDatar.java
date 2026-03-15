/* Nama File    : MBangunDatar.java
 * Deskripsi    : berisi pengaplikasian dari method class BangunDatar, Lingkaran, dan Persegi
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 11 Maret 2026 */

public class MBangunDatar {
    public static void main(String[] args) {
        Persegi P1 = new Persegi();
        Persegi P2 = new Persegi(40.0, "abu-abu", "ungu");

        Lingkaran L1 = new Lingkaran(28.0, "putih", "hitam");
        Lingkaran L2 = new Lingkaran();
        
        P1.setBorder("biru tua");
        P1.setSisi(10.0);
        P1.setWarna("oranye");
        P2.getBorder();
        P2.getSisi();
        P2.getWarna();
        
        L1.getWarna();
        L1.getBorder();
        L1.getJari();
        L2.setWarna("burgundy");
        L2.setBorder("kuning");
        L2.setJari(9.0);

        System.out.println("-----BANGUN DATAR 1-----");
        P1.printInfo();
        System.out.println("Luas: " + P1.getLuas());
        System.out.println("Keliling: " + P1.getKeliling());
        System.out.println("Diagonal: " + P1.getDiagonal());

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
    }
}
