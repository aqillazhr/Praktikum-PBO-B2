/* Nama File    : Petani.java
 * Deskripsi    : berisi atribut dan method dalam class Petani
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 22 Maret 2026 */

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {
    /* *******************ATRIBUT******************* */
    private String asal_kota;
    private static int counterPetani = 0;
    private static final int C = 1;

    /* *******************METHOD******************* */
    //konstruktor
    Petani() {
        super();
        this.asal_kota = "-";
        counterPetani++;
    }

    Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    //selektor
    public String getAsalKota() {
        return asal_kota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    //mutator
    public void setAsalKota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    //method lain
    @Override
    public int hitungMasaKerja() {
        Period masaKerja = Period.between(getTglMulaiKerja(), LocalDate.now());
        return masaKerja.getYears() + C;
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak: " + hitungPajak());
    }
}
