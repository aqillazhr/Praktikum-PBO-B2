/* Nama File    : CivitasAkademika.java
 * Deskripsi    : Penerapan polimorfisme inclusion pada Java
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 25 April 2026 */

public abstract class Civitasakademika {
    /* *******************ATRIBUT******************* */
    protected String Nama;

    /* *******************METHOD******************* */
    //konstruktor
    public Civitasakademika() {
        this.Nama = "";
    }
    public Civitasakademika(String Nama) {
        this.Nama = Nama;
    }

    //selektor
    public String getNama() {
        return this.Nama;
    }

    public abstract String getNomor();
}