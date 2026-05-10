/* Nama File    : Anabul.java
 * Deskripsi    : Penerapan generik di bahasa Java
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 6 Mei 2026 */

public abstract class Anabul {
    /* *******************ATRIBUT******************* */
    private String nama;
    private String panggilan;

    /* *******************METHOD******************* */
    //Konstruktor
    public Anabul() {
        this.nama ="";
        this.panggilan = "";
    }
    
    public Anabul(String nama, String panggilan) {
        this.nama = nama;
        this.panggilan = panggilan;
    }

    //selektor
    public String getNama() {
        return this.nama;
    }

    public String getPanggilan() {
        return this.panggilan;
    }

    //Mutator
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPanggilan(String panggilan) {
        this.panggilan = panggilan;
    }

    //method lain
    public abstract void Gerak();

    public abstract void Bersuara();
}
