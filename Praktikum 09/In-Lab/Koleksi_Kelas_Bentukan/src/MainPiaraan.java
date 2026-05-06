/* Nama File    : MainPiaraan.java
 * Deskripsi    : Pengaplikasian koleksi Queue pada class bentukan
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 6 Mei 2026 */

public class MainPiaraan {
    public static void main(String[] args) {
        //Kamus
        Piaraan Piaraan1;

        //Algoritma
        Piaraan1 = new Piaraan();
        Piaraan1.enqueueAnabul(new Kucing("Gorun", 4.5));
        Piaraan1.enqueueAnabul(new Anjing("Piko"));
        Piaraan1.enqueueAnabul(new Burung("Jojo"));

        System.out.println("-----DAFTAR PIARAAN-----");
        Piaraan1.showAnabul();
        System.out.println("Jumlah piaraan:");
        System.out.println(Piaraan1.getNbelm());
        System.out.println();

        System.out.println("----- dequeueAnabul() -----");
        System.out.println("Piaraan yang keluar:");
        System.out.println(Piaraan1.dequeueAnabul().getNama());
        System.out.println();
        System.out.println("Setelah dequeue");
        Piaraan1.showAnabul();
        System.out.println("Jumlah piaraan sekarang:");
        System.out.println(Piaraan1.getNbelm());
    }
}