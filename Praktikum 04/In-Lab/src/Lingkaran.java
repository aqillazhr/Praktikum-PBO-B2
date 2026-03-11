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

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

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
}