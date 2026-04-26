/* Nama File    : Anabul.java
 * Deskripsi    : Penerapan polimorfisme inclusion pada Java
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 25 April 2026 */

public abstract class Anabul {
    /* *******************ATRIBUT******************* */
    protected String Nama;

    /* *******************METHOD******************* */
    public Anabul(String Nama) {
        this.Nama = Nama;
    }

    public abstract void Gerak();

    public abstract void Bersuara();
}
