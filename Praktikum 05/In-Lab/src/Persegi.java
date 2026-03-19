/* Nama File    : Persegi.java
 * Deskripsi    : berisi atribut dan method dalam class Persegi
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 18 Maret 2026 */

public class Persegi extends BangunDatar implements IResize{
    /* *******************ATRIBUT******************* */
    private double sisi;

    /* *******************METHOD******************* */
    //konstruktor
    public Persegi() {
        setJmlSisi(4);
    }

    // public Persegi(double sisi, String warna, String border) {
    //     this.sisi = sisi;
    //     setWarna(warna);
    //     setBorder(border);
    //     setJmlSisi(4);
    // }

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    //selektor
    public double getSisi() {
        return sisi;
    }

    //mutator
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    //method lain
    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    @Override
    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    // @Override
    // public void printInfo() {
    //     System.out.println("Jumlah sisi: " + getJmlSisi());
    //     System.out.println("Warna: " + getWarna());
    //     System.out.println("Border: " + getBorder());
    //     System.out.println("Sisi: " + sisi);
    // }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }

    @Override
    public void zoomIn() {
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut() {
        sisi = sisi * 0.9;
    }

    @Override
    public void zoom(int percent) {
        sisi = sisi * percent / 100.0;
    }
}
