/* Nama File    : Pegawai.java
 * Deskripsi    : berisi atribut dan method dari class Pegawai
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 15 Maret 2026 */

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai {
    /* *******************ATRIBUT******************* */
    private String NIP;
    private String nama;
    private LocalDate tanggalLahir;
    private LocalDate TMT;
    private double gajiPokok;

    /* *******************METHOD******************* */
    //konstruktor
    public Pegawai() {
        this.NIP = "-";
        this.nama = "-";
        this.tanggalLahir = LocalDate.now();
        this.TMT = LocalDate.now();
        this.gajiPokok = 0.0;
    }

    public Pegawai(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    //selektor
    public String getNip() {
        return NIP;
    }

    public String getNama() {
        return nama;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public LocalDate getTmt() {
        return TMT;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    //mutator
    public void setNip(String NIP) {
        this.NIP = NIP;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public void setTmt(LocalDate TMT) {
        this.TMT = TMT;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    //method lain
    public String getMasaKerja() {
        Period periodeKerja = Period.between(TMT, LocalDate.now());
        return periodeKerja.getYears() + " tahun " + periodeKerja.getMonths() + " bulan ";
    }

    public void printInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + tanggalLahir.format(formatter));
        System.out.println("TMT: " + TMT.format(formatter));
        System.out.println("Masa Kerja: " + getMasaKerja());
        System.out.println("Gaji Pokok: Rp" + String.format("%,.2f", gajiPokok));
    }
}
