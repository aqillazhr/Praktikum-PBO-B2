/* Nama File    : Lingkaran.java
 * Deskripsi    : berisi atribut dan method dalam class Lingkaran
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 11 Maret 2026 */

public class Lingkaran extends BangunDatar {
    /* *******************ATRIBUT******************* */
    private double jari;

    /* *******************METHOD******************* */
    public Lingkaran() {
        this.setJmlSisi(1);
        this.jari = 1;
    }

    public Lingkaran(double jariJari, String warna, String border) {
        this.setJmlSisi(1);
        this.setWarna(warna);
        this.setBorder(border);
        this.jari = jariJari;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jariJari) {
        this.jari = jariJari;
    }

    public double getLuas() {
        return Math.PI * this.jari * this.jari;
    }
    
    public double getKeliling() {
        return 2 * Math.PI * this.jari;
    }
}
