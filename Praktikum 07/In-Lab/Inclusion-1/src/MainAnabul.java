/* Nama File    : Anjing.java
 * Deskripsi    : Penerapan polimorfisme inclusion pada Java
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 25 April 2026 */

public class MainAnabul {
    public static void main(String[] args) {
        Anabul kucing = new Kucing("Kucing");
        Anabul anjing = new Anjing("Anjing");
        Anabul burung = new Burung("Burung");

        kucing.Gerak();
        kucing.Bersuara();
        System.out.println();

        anjing.Gerak();
        anjing.Bersuara();
        System.out.println();

        burung.Gerak();
        burung.Bersuara();
    }
}
