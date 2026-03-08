/* Nama File    : MMahasiswa.java
 * Deskripsi    : pengaplikasian dari relasi antara class Mahasiswa, MataKuliah, Kendaraan, dan Dosen
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 8 Februari 2026 */

public class MMahasiswa {
    public static void main(String[] args) {
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        MataKuliah IMK = new MataKuliah("IMK", "Interaksi Manusia dan Komputer", 3);

        Mahasiswa M1 = new Mahasiswa ("234", "Citra", "Informatika", "H1234AB", "Motor");
        Mahasiswa M2 = new Mahasiswa ("24060124140146", "Shafa Aqilla Zahira", "Informatika", "BE6789YZ", "Motor");

        Dosen D1 = new Dosen("123", "Andi", "Informatika");
        Dosen D2 = new Dosen("456", "Abidin", "Informatika");

        M1.setDosenWali(D1);
        M2.setDosenWali(D2);
        M1.addMatkul(PBO);
        M1.addMatkul(MBD);
        M2.addMatkul(IMK);
        M2.addMatkul(PBO);

        System.out.println("-----DATA MAHASISWA 1-----");
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatkul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());

        System.out.println("-----DATA MAHASISWA 2-----");
        M2.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M2.getJumlahMatkul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M2.getJumlahSKS());
    }
}
