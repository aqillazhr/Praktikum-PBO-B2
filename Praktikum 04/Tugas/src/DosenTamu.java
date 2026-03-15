/* Nama File    : DosenTamu.java
 * Deskripsi    : berisi pengaplikasian dari class DosenTamu
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 15 Maret 2026 */

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DosenTamu extends Dosen {
    /* *******************ATRIBUT******************* */
    private String NIDK;
    private LocalDate berakhirKontrak;

    /* *******************METHOD******************* */
    //konstruktor
    public DosenTamu() {
        super();
        this.NIDK = "-";
        this.berakhirKontrak = LocalDate.now();
    }

    public DosenTamu(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas, String NIDK, LocalDate berakhirKontrak) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.berakhirKontrak = berakhirKontrak;
    }

    //selektor
    public String getNidk() {
        return NIDK;
    }

    public LocalDate getBerakhirKontrak() {
        return berakhirKontrak;
    }

    //mutator
    public void setNidk(String NIDK) {
        this.NIDK = NIDK;
    }

    public void setBerakhirKontrak(LocalDate berakhirKontrak) {
        this.berakhirKontrak = berakhirKontrak;
    }

    //method lain
    public double getTunjangan() {
        return 0.25 * getGajiPokok();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        System.out.println("NIDK: " + NIDK);
        System.out.println("Jabatan: Dosen Tamu");
        System.out.println("Tanggal Berakhir Kontrak: " + getBerakhirKontrak().format(formatter));
        System.out.println("Tunjangan: Rp" + String.format("%,.2f", getTunjangan()));

    }
}
