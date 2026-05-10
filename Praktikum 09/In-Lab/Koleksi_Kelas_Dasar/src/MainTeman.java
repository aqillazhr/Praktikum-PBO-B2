/* Nama File    : MainTeman.java
 * Deskripsi    : Pengaplikasian dari penerapan koleksi pada class dasar di bahasa Java
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 6 Mei 2026 */

public class MainTeman {
    public static void main(String[] args) {
        // Kamus
        Teman Teman1;
        // Teman Teman1; --> seperti contoh pengaplikasian di kelas dan di lab (berlaku juga di class Teman)
        // Teman <String> Teman1; --> seperti contoh ppt di kelas dan di lab (berlaku juga di class Teman)

        // Algoritma
        Teman1 = new Teman();
        Teman1.addNama("Shafa");
        Teman1.addNama("Aqilla");
        Teman1.addNama("Zahira");
        Teman1.addNama("Riva");
        Teman1.addNama("Shafa");

        System.out.println("-----DAFTAR TEMAN-----");
        Teman1.showTeman();
        System.out.println();

        System.out.println("Teman pada indeks 1: " + Teman1.getNama(1));
        System.out.println();
        System.out.println("Jumlah teman: " + Teman1.getNbelm());
        System.out.println();

        Teman1.setNama(1, "Upim");
        System.out.println("setelah setNama Upim di indeks ke 1");
        Teman1.showTeman();
        System.out.println();
        System.out.println("Apakah Riva adalah teman?");
        System.out.println(Teman1.isMember("Riva"));
        System.out.println();

        Teman1.gantiNama("Riva", "Boboiboy");
        System.out.println("Setelah gantiNama Riva menjadi Boboiboy");
        Teman1.showTeman();
        System.out.println();

        System.out.println("Jumlah orang bernama Shafa:");
        System.out.println(Teman1.countNama("Shafa"));
        System.out.println();

        Teman1.delNama("Upim");
        System.out.println("Setelah delNama Upim");
        Teman1.showTeman();
        System.out.println();
        System.out.println("Jumlah teman sekarang: " + Teman1.getNbelm());
    }
}
