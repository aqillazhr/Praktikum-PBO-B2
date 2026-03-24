/* Nama File    : Pengusaha.java
 * Deskripsi    : berisi atribut dan method dalam class Pengusaha
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 22 Maret 2026 */

import java.time.*;

public class Pengusaha extends Manusia implements Pajak {
    /* *******************ATRIBUT******************* */
    private String npwp;
    private static int counterPengusaha = 0;
    private static final int B = 4; //digit ke 13 NIM

    /* *******************METHOD******************* */
    //konstruktor
    public Pengusaha() {
        super();
        this.npwp = "-";
        counterPengusaha++;
    }

    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    //selektor
    public String getNpwp() {
        return npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    //mutator
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    //method lain
    @Override
    public int hitungMasaKerja() {
        Period masaKerja = Period.between(getTglMulaiKerja(), LocalDate.now());
        return masaKerja.getYears() + B;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * getPendapatan();
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak: " + hitungPajak());
    }
}
