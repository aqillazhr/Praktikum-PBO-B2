/* Nama File    : Burung.java
 * Deskripsi    : Penerapan polimorfisme inclusion pada Java
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 25 April 2026 */

public class Burung extends Anabul {
    /* *******************ATRIBUT******************* */

    /* *******************METHOD******************* */
    public Burung() {
        super();
    }
    
    public Burung(String Nama) {
        super(Nama);
    }

    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak terbang");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " berbunyi cuit");
    }
}
