/* Nama File    : Anabul.java
 * Deskripsi    : Penerapan polimorfisme inclusion pada Java
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 25 April 2026 */

public abstract class Anabul {
    /* *******************ATRIBUT******************* */
    private String Nama;

    /* *******************METHOD******************* */
    public Anabul() {
        this.Nama ="";
    }
    
    public Anabul(String Nama) {
        this.Nama = Nama;
    }

    public String getNama() {
        return this.Nama;
    }

    public abstract void Gerak();

    public abstract void Bersuara();
}
