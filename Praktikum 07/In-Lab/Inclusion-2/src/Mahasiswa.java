/* Nama File    : Dosen.java
 * Deskripsi    : Penerapan polimorfisme inclusion pada Java
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 25 April 2026 */

public class Mahasiswa extends CivitasAkademika{
    /* *******************ATRIBUT******************* */
    private String NIM;
    private Dosen DosenWali;

    /* *******************METHOD******************* */
    //konstruktor
    public Mahasiswa() {
        super("");
        this.NIM = "";
        this.DosenWali = new Dosen("", "");
    }

    public Mahasiswa(String Nama, String NIM, Dosen DosenWali) {
        super(Nama);
        this.NIM = NIM;
        this.DosenWali = DosenWali;
    }

    //selektor
    @Override
    public String getNomor() {
        return this.NIM;
    }

    public Dosen getDosenWali() {
        return this.DosenWali;
    }

    //mutator
    public void setNomor( String NIP) {
        this.NIM = NIP;
    }

    public void setWali(Dosen dosen) {
        this.DosenWali = dosen;
    }

    public void tampilDataMahasiswa() {
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + getNama());
        System.out.println("Dosen Wali: " + DosenWali.getNama());
    }
}