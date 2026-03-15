/* Nama File    : DosenTetap.java
 * Deskripsi    : berisi pengaplikasian dari class DosenTetap
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 15 Maret 2026 */

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DosenTetap extends Dosen {
    /* *******************ATRIBUT******************* */
    private String NIDN;
    private static final int BUP = 65;

    /* *******************METHOD******************* */
    //konstruktor
    public DosenTetap() {
        super();
        this.NIDN = "-";
    }

    public DosenTetap(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas, String NIDN) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDN = NIDN;
    }

    //selektor
    public int getBUP() {
        return BUP;
    }
    
    public String getNidn() {
        return NIDN;
    }

    //mutator
    public void setNidn(String NIDN) {
        this.NIDN = NIDN;
    }

    //method lain
    public double getTunjangan() {
        Period masaKerja = Period.between(getTmt(), LocalDate.now());
        return 0.02 * masaKerja.getYears() * getGajiPokok();
    }

    public LocalDate getTanggalPensiun() {
        return getTanggalLahir().plusYears(BUP).withDayOfMonth(1).plusMonths(1);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        System.out.println("NIDN: " + NIDN);
        System.out.println("Jabatan: Dosen Tetap");
        System.out.println("Tanggal Pensiun: " + getTanggalPensiun().format(formatter));
        System.out.println("Tunjangan: Rp" + String.format("%,.2f", getTunjangan()));
    }
}
