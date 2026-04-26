/* Nama File    : Dosen.java
 * Deskripsi    : Penerapan polimorfisme inclusion pada Java
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 25 April 2026 */

public class Dosen extends CivitasAkademika {
    /* *******************ATRIBUT******************* */
    protected String NIP;

    /* *******************METHOD******************* */
    //konstruktor
    public Dosen() {
        super();
        this.NIP = "";
    }

    public Dosen(String Nama, String NIP) {
        super(Nama);
        this.NIP = NIP;
    }

    //selektor
    @Override
    public String getNomor() {
        return this.NIP;
    }

    //mutator
    public void setNomor( String NIP) {
        this.NIP = NIP;
    }
}
