/* Nama File    : MSeminar.java
 * Deskripsi    : Penerapan polimorfisme inclusion pada Java
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 25 April 2026 */

public class MSeminar {
    public static void main(String[] args) {
        Dosen D1 = new Dosen("Pak Baekhyun", "123456");
        Dosen D2 = new Dosen("Bu Irene", "235643");

        Mahasiswa M1 = new Mahasiswa("Shafa", "456736", D1);
        Mahasiswa M2 = new Mahasiswa("Aqilla", "456737", D1);
        Mahasiswa M3 = new Mahasiswa("Zahira", "178633", D2);
        Mahasiswa M4 = new Mahasiswa("Riva", "798736", D2);
        Mahasiswa M5 = new Mahasiswa("Eka", "873652", D1);

        Seminar S1 = new Seminar();

        S1.registrasi(D1);
        S1.registrasi(D2);
        S1.registrasi(M1);
        S1.registrasi(M2);
        S1.registrasi(M3);
        S1.registrasi(M4);
        S1.registrasi(M5);

        System.out.println("Jumlah peserta seminar: " + S1.countPeserta());
        System.out.println();

        System.out.println("-----Daftar Peserta Seminar-----");
        S1.tampilPeserta();

        System.out.println();

        System.out.println("Jumlah mahasiswa: " + S1.countMahasiswa());
        System.out.println();

        System.out.println("Sebelum setWali()");
        M1.tampilDataMahasiswa();
        System.out.println();
        M1.setWali(D2);
        System.out.println("Setelah setWali()");
        M1.tampilDataMahasiswa();
        System.out.println();

        System.out.println("-----Data Mahasiswa-----");
        System.out.println("Mahasiswa 1");
        M1.tampilDataMahasiswa();
        System.out.println();

        System.out.println("Mahasiswa 2");
        M2.tampilDataMahasiswa();
        System.out.println();

        System.out.println("Mahasiswa 3");
        M3.tampilDataMahasiswa();
        System.out.println();

        System.out.println("Mahasiswa 4");
        M4.tampilDataMahasiswa();
        System.out.println();

        System.out.println("Mahasiswa 5");
        M5.tampilDataMahasiswa();
    }
}