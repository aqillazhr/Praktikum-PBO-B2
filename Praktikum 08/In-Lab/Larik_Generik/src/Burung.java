/* Nama File    : Burung.java
 * Deskripsi    : Penerapan generik di bahasa Java
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 29 April 2026 */

public class Burung extends Anabul {
    /* *******************ATRIBUT******************* */

    /* *******************METHOD******************* */
    //Konstruktor
    public Burung() {
        super();
    }
    
    public Burung(String Nama) {
        super(Nama);
    }

    //Method lain
    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak terbang");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " berbunyi cuit");
    }
}