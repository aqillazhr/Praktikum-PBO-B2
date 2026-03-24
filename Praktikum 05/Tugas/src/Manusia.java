/* Nama File    : Manusia.java
 * Deskripsi    : berisi atribut dan method dalam abstract class Manusia
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 22 Maret 2026 */

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class Manusia {
    /* *******************ATRIBUT******************* */
    private String nama;
    private LocalDate tgl_mulai_kerja;
    private String alamat;
    private double pendapatan;
    private static int counterMns = 0;

    /* *******************METHOD******************* */
    //konstruktor
    public Manusia() {
        this.nama = "-";
        this.tgl_mulai_kerja = LocalDate.now();
        this.alamat = "-";
        this.pendapatan = 0.0;
        counterMns++;
    }

    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    //selektor
    public String getNama() {
        return this.nama;
    }

    public LocalDate getTglMulaiKerja() {
        return this.tgl_mulai_kerja;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public double getPendapatan() {
        return this.pendapatan;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    //mutator
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTglMulaiKerja(LocalDate tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    //method lain
    public void cetakInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", new Locale("id", "ID"));
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Bekerja: " + tgl_mulai_kerja.format(formatter));
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }

    public abstract int hitungMasaKerja();
}
