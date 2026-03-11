/* Nama File    : Persegi.java
 * Deskripsi    : berisi atribut dan method dalam class Persegi
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 11 Maret 2026 */

public class Persegi extends BangunDatar{
    /* *******************ATRIBUT******************* */
    private double sisi;

    /* *******************METHOD******************* */
    public Persegi() {
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border) {
        this.sisi = sisi;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(4);
    }

    // public Persegi(double sisi, String warna, String border) {
    //     super(4, warna, border);
    //     this.sisi = sisi;
    // }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas(double sisi) {
        return sisi * sisi;
    }

    public double getKeliling(double sisi) {
        return 4 * sisi;
    }

    public double getDiagonal(double sisi) {
        return sisi * Math.sqrt(2);
    }

    @Override
    public void printInfo() {
        System.out.println("Jumlah sisi: " + getJmlSisi());
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
        System.out.println("Sisi: " + sisi);
    }

    // @Override
    // public void printInfo() {
    //     super.printInfo();
    //     System.out.println("Sisi: " + sisi);
    // }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Persegi: ");
        BangunDatar.printCounterBangunDatar();
    }
}
