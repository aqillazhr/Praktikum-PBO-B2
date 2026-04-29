/* Nama File    : Kucing.java
 * Deskripsi    : Penerapan generik pada class di bahasa Java
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 29 April 2026 */

public class Kucing extends Anabul {
    /* *******************ATRIBUT******************* */
    private double bobot;
    /* *******************METHOD******************* */
    //Konstruktor
    public Kucing() {
        super();
        this.bobot = 0.0;
    }
    
    public Kucing(String Nama, double bobot) {
        super(Nama);
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