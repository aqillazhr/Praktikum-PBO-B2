/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dari class Dosen
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 15 Maret 2026 */

import java.time.*;

public class Dosen extends Pegawai {
    /* *******************ATRIBUT******************* */
    private String fakultas;

    /* *******************METHOD******************* */
    //konstruktor
    public Dosen() {
        super();
        this.fakultas = "-";
    }

    public Dosen(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.fakultas = fakultas;
    }

    //selektor
    public String getFakultas() {
        return fakultas;
    }

    //mutator
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    //method lain
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas: " + fakultas);
    }
}
