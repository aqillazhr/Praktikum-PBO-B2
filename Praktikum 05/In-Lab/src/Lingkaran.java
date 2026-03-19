/* Nama File    : Lingkaran.java
 * Deskripsi    : berisi atribut dan method dalam class Lingkaran
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 18 Maret 2026 */

public class Lingkaran extends BangunDatar implements IResize{
    /* *******************ATRIBUT******************* */
    private double jari;

    /* *******************METHOD******************* */
    //konstruktor
    public Lingkaran() {
        this.setJmlSisi(1);
        this.jari = 1;
    }

    public Lingkaran(double diameter, String warna, String border) {
        this.setJmlSisi(1);
        this.setWarna(warna);
        this.setBorder(border);
        this.jari = diameter / 2.0;
    }

    // public Lingkaran(double diameter, String warna, String border) {
    //     super(1, warna, border);
    //     this.jari = diameter / 2.0;
    // }

    //selektor
    public double getJari() {
        return jari;
    }

    //mutator
    public void setJari(double jari) {
        this.jari = jari;
    }

    //method lain
    public double getLuas() {
        return Math.PI * this.jari * this.jari;
    }
    
    public double getKeliling() {
        return 2 * Math.PI * this.jari;
    }

    @Override
    public void printInfo(){
        System.out.println("Jumlah sisi: " + getJmlSisi());
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
        System.out.println("Jari-jari: " + jari);
    }

    // @Override
    // public void printInfo(){
    //     super.printInfo();
    //     System.out.println("Jari-jari: " + jari);
    // }

    @Override
    public void zoomIn() {
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut() {
        jari = jari * 0.9;
    }

    public void zoom(int percent) {
        jari = jari * percent / 100;
    }
}