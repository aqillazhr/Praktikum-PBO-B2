/* Nama File    : Main.java
 * Deskripsi    : berisi pengaplikasian dari method class Pegawai, Dosen, DosenTamu, DosenTetap, dan Tendik
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 15 Maret 2026 */

import java.time.*;

public class Main {
    public static void main(String[] args) {
        DosenTamu DosenTamu1 = new DosenTamu("123456", "Kim Jun Myeon", LocalDate.of(1991,5,22), LocalDate.of(2023,3,26), 15000000.00, "Fakultas Hukum", "134987465", LocalDate.of(2026, 3, 26));
        DosenTetap DosenTetap1 = new DosenTetap("231457", "Park Chan Yeol", LocalDate.of(1982, 11, 27), LocalDate.of(2016, 05, 03), 20000000.00, "Fakultas Sains dan Matematika", "240123874");
        Tendik Tendik1 = new Tendik("234876", "Byun Baekhyun", LocalDate.of(1992, 05, 06), LocalDate.of(2020, 10, 10), 15000000.00, "Akademik");

        System.out.println("-----PEGAWAI 1-----");
        DosenTamu1.printInfo();

        System.out.println("-----PEGAWAI 2-----");
        DosenTetap1.printInfo();

        System.out.println("-----PEGAWAI 3-----");
        Tendik1.printInfo();
    }
}
