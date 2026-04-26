/* Nama File    : Anjing.java
 * Deskripsi    : Penerapan polimorfisme inclusion pada Java
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 25 April 2026 */

public class Anjing extends Anabul{
    /* *******************ATRIBUT******************* */

    /* *******************METHOD******************* */
    public Anjing(String Nama) {
        super(Nama);
    }

    @Override
    public void Gerak() {
        System.out.println(Nama + " bergerak melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(Nama + " bersuara guk-guk");
    }
}