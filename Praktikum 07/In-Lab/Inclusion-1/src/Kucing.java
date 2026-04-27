/* Nama File    : Kucing.java
 * Deskripsi    : Penerapan polimorfisme inclusion pada Java
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 25 April 2026 */

public class Kucing extends Anabul {
    /* *******************ATRIBUT******************* */

    /* *******************METHOD******************* */
    public Kucing() {
        super();
    }
    
    public Kucing(String Nama) {
        super(Nama);
    }

    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " berbunyi meong");
    }
}
