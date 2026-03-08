/* Nama File    : MataKuliah.java
 * Deskripsi    : berisi atribut dan method dalam class MataKuliah
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 7 Februari 2026 */

public class MataKuliah {
    /* *******************ATRIBUT******************* */
    private String idMatkul;
    private String nama;
    private int sks;
    
    /* *******************METHOD******************* */
    //konstruktor
    public MataKuliah() {
        idMatkul = "###";
        nama = "###";
        sks = 0;
    }

    public MataKuliah(String idMatkul, String nama, int sks) {
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    //selektor
    public String getidMatkul() {
        return idMatkul;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    //mutator
    public void setIdMatkul(String idm) {
        this.idMatkul = idm;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
}
