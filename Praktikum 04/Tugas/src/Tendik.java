/* Nama File    : Tendik.java
 * Deskripsi    : berisi pengaplikasian dari class Tendik
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 15 Maret 2026 */

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Tendik extends Pegawai{
    /* *******************ATRIBUT******************* */
    private static final int BUP = 55;
    private String bidang;

    /* *******************METHOD******************* */
    //konstruktor
    public Tendik() {
        super();
        this.bidang = "-";
    }

    public Tendik(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String bidang) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }

    //selektor
    public int getBup() {
        return BUP;
    }

    public String getBidang() {
        return bidang;
    }

    //mutator
    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    //method lain
    private double getTunjangan() {
        Period periodeKerja = Period.between(getTmt(), LocalDate.now());
        return 0.01 * periodeKerja.getYears() * getGajiPokok();
    }

    private LocalDate getTanggalPensiun() {
        return getTanggalLahir().plusYears(BUP).withDayOfMonth(1).plusMonths(1);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        System.out.println("Jabatan: Tendik");
        System.out.println("Bidang: " + getBidang());
        System.out.println("Tanggal Pensiun: " + getTanggalPensiun().format(formatter));
        System.out.println("Tunjangan: Rp" + String.format("%,.2f", getTunjangan()));
    }
}
