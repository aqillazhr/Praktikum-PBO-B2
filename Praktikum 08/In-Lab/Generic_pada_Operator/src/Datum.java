/* Nama File    : Datum.java
 * Deskripsi    : Penerapan dan pengaplikasian generik pada class di bahasa Java
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 29 April 2026 */

public class Datum <G> {
    /* *******************ATRIBUT******************* */
    protected G isi;

    /* *******************METHOD******************* */
    //Konstruktor
    public Datum() {
        this.isi = null;
    }

    public Datum(G isi) {
        this.isi = isi;
    }

    //Selektor
    public G getIsi() {
        return this.isi;
    }

    //mutator
    public void setIsi(G isibaru) {
        this.isi = isibaru;
    }

    //Main program
    public static void main(String[] args) {
        //Kamus
        Kucing cat;
        Datum<Anabul> anu;

        //Algoritma
        cat = new Kucing("Cat", 10.0);
        anu = new Datum<>();

        anu.setIsi(cat);
        anu.getIsi().Gerak();
        anu.getIsi().Bersuara();
        System.out.println("Bobot cat adalah: " + cat.getBobot());
        System.out.println();

        anu.setIsi(new Anjing("Dog"));
        anu.getIsi().Gerak();
        anu.getIsi().Bersuara();
        System.out.println();

        anu.setIsi(new Burung("Bird"));
        anu.getIsi().Gerak();
        anu.getIsi().Bersuara();
    }
}
