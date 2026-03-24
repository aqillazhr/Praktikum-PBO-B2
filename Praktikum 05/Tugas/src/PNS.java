/* Nama File    : PNS.java
 * Deskripsi    : berisi atribut dan method dalam class PNS
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 22 Maret 2026 */

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak{
    /* *******************ATRIBUT******************* */
    private String nip;
    private static int counterPNS = 0;
    private static final int A = 6;

    /* *******************METHOD******************* */
    //konstruktor
    public PNS() {
        super();
        this.nip = "-";
        counterPNS++;
    }

    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    //selektor
    public String getNip() {
        return nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    //mutator
    public void setNip(String nip) {
        this.nip = nip;
    }

    //method lain
    @Override
    public int hitungMasaKerja() {
        Period masaKerja = Period.between(getTglMulaiKerja(), LocalDate.now());
        return masaKerja.getYears() + A;
    }

    @Override
    public double hitungPajak() {
        return 0.1 * getPendapatan();
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak: " + hitungPajak());
    }
}