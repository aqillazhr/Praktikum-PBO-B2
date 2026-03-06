/* Nama File    : MGaris.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Shafa Aqilla Zahira
 * Tanggal      : 27 Februari 2026 */

public class MGaris {
    public static void main(String[] args) {
        Garis G1 = new Garis();
        G1.printGaris();
        Garis G2 = new Garis(new Titik(2, 3), new Titik(4,5));
        G2.printGaris();
        Garis G3 = new Garis(new Titik(2, 3), new Titik(6,3));
        G3.printGaris();
        Garis G4 = new Garis(new Titik(2, 6), new Titik(6,6));
        G4.printGaris();
        Garis G5 = new Garis(new Titik(3, 2), new Titik(3, 8));
        G5.printGaris();

        // *******************getPanjangGaris*******************
        System.out.println("panjang garis tersebut adalah " + G2.getPanjangGaris());

        // *******************getGradien*******************
        System.out.println("gradien garis tersebut adalah " + G3.getGradien());

        // *******************getTitikTengah*******************
        System.out.println("titik tengah garis tersebut adalah ");
        G3.getTitikTengah().printTitik();

        // *******************isSejajar*******************
        System.out.println("apakah garis G3 sejajar dengan G4? " + G3.isSejajar(G4));

        // *******************isTegakLurus*******************
        System.out.println("apakah garis G4 tegak lurus dengan G5? " + G4.isTegakLurus(G5));

        // *******************printPersamaanGaris*******************
        System.out.println("persamaan garis tersebut adalah ");
        G4.printPersamaanGaris();

        // *******************counterGaris*******************
        System.out.println("jumlah objek garis yang telah dibuat sebanyak " + Garis.getCounterGaris());
    }
}