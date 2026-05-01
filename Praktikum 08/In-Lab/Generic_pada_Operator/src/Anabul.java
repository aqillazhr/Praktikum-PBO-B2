/* Nama File    : Anabul.java
 * Deskripsi    : Penerapan generik di bahasa Java
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 29 April 2026 */

public abstract class Anabul {
    /* *******************ATRIBUT******************* */
    private String Nama;

    /* *******************METHOD******************* */
    //Konstruktor
    public Anabul() {
        this.Nama ="";
    }
    
    public Anabul(String Nama) {
        this.Nama = Nama;
    }

    //selektor
    public String getNama() {
        return this.Nama;
    }

    //Mutator
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    //method lain
    public abstract void Gerak();

    public abstract void Bersuara();
}
