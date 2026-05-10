/* Nama File    : Kucing.java
 * Deskripsi    : Penerapan generik di bahasa Java
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 6 Mei 2026 */

public class Kucing extends Anabul {
    /* *******************ATRIBUT******************* */
    private double bobot;
    /* *******************METHOD******************* */
    //Konstruktor
    public Kucing() {
        super();
        this.bobot = 0.0;
    }
    
    public Kucing(String nama, String panggilan, double bobot) {
        super(nama, panggilan);
        this.bobot = bobot;
    }

    //Selektor
    public double getBobot() {
        return this.bobot;
    }

    //mutator
    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    //Method lain
    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " berbunyi meong");
    }
}