/* Nama File    : CivitasAkademika.java
 * Deskripsi    : Penerapan polimorfisme inclusion pada Java
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 25 April 2026 */

public abstract class CivitasAkademika {
    /* *******************ATRIBUT******************* */
    protected String Nama;

    /* *******************METHOD******************* */
    //konstruktor
    public CivitasAkademika() {
        this.Nama = "-";
    }
    public CivitasAkademika(String nama) {
        this.Nama = nama;
    }

    //selektor
    public String getNama() {
        return this.Nama;
    }

    public abstract String getNomor();

    //mutator
    public void setNama(String Nama) {
        this.Nama = Nama;
    }
}