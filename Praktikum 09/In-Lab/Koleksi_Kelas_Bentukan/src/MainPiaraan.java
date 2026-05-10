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
        Piaraan1.enqueueAnabul(new Kucing("Gorun", "Ci Ndut", 4.5));
        Piaraan1.enqueueAnabul(new Anjing("Piko", "Anjing comel"));
        Piaraan1.enqueueAnabul(new Burung("Jojo", "My piupiu"));
        Piaraan1.enqueueAnabul(new Anggora("Pagorun", "Bapak Gorun", 5.5));
        Piaraan1.enqueueAnabul(new Kembangtelon("Magorun", "Emak Gorun", 4.0));

        System.out.println("-----DAFTAR PIARAAN-----");
        Piaraan1.showAnabul();
        System.out.println("Jumlah piaraan:" + Piaraan1.getNbelm());
        System.out.println();

        System.out.println("Piaraan yang didequeue: " + Piaraan1.dequeueAnabul().getNama());
        System.out.println();
        System.out.println("Setelah dequeue: ");
        Piaraan1.showAnabul();
        System.out.println();
        System.out.println("Jumlah piaraan sekarang:" + Piaraan1.getNbelm());
        System.out.println();

        System.out.println("Class dari Piaraan pertama: " + Piaraan1.getAnabul().getClass().getSimpleName());
        System.out.println();
        
        System.out.println("Apakah Cubby merupakan member dari Piaraan? ");
        System.out.println(Piaraan1.isMember(new Burung("Cubby", "Cuwiw")));
        System.out.println();

        System.out.println("Jumlah keluarga kucing: " + Piaraan1.countKucing());
        System.out.println();

        System.out.println("Total bobot keluarga kucing: " + Piaraan1.bobotKucing());
        System.out.println();

        System.out.println("-----Jenis-jenis Anabul-----");
        Piaraan1.showJenisAnabul();
    }
}