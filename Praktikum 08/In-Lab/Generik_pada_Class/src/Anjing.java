/* Nama File    : Anjing.java
 * Deskripsi    : Penerapan generik pada class di bahasa Java
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 29 April 2026 */

public class Anjing extends Anabul{
    /* *******************ATRIBUT******************* */

    /* *******************METHOD******************* */
    //konstruktor
    public Anjing() {
        super();
    }
    
    public Anjing(String Nama) {
        super(Nama);
    }

    //Method lain
    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " bersuara guk-guk");
    }
}