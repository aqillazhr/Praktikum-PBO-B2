/* Nama File    : BangunDatar.java
 * Deskripsi    : berisi atribut dan method dalam abstract class BangunDatar
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 18 Maret 2026 */

public abstract class BangunDatar {
    /* *******************ATRIBUT******************* */
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    /* *******************METHOD******************* */
    //konstruktor
    public BangunDatar() {
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    //selektor
    public int getJmlSisi() {
        return jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public String getBorder() {
        return border;
    }

    //mutator
    public void setJmlSisi (int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    //method lain
    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    public abstract double getLuas();

    public abstract double getKeliling();

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }

    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }
}
