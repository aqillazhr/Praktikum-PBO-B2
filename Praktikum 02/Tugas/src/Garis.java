/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Shafa Aqilla Zahira
 * Tanggal      : 27 Februari 2026 */

public class Garis {
    /* *******************ATRIBUT******************* */
    Titik T1;
    Titik T2;
    static int counterGaris = 0;

    /* *******************METHOD******************* */
    //konstruktor tanpa parameter yang menginisialisasi titik awal dengan (0,0) dan titik akhir dengan (1,1)
    Garis() {
        T1 = new Titik();
        T2 = new Titik(1, 1);
        counterGaris++;
    }

    //konstruktor dengan parameter masukan titik awal dan titik akhir
    Garis(Titik T1, Titik T2) {
        this.T1 = T1;
        this.T2 = T2;
        counterGaris++;
    }

    //Selektor (getter) untuk setiap atribut beserta mutatornya (setter)
    //Tambahkan pula selektor untuk mendapatkan atribut static counterGaris

    //mengembalikan nilai T1
    Titik getTitikAwal() {
        return T1;
    }

    //mengembalikan nilai T2
    Titik getTitikAkhir() {
        return T2;
    }

    //mengeset T1 dengan nilai lain
    void setTitikAwal(Titik T1) {
        this.T1 = T1;
    }

    //mengeset T2 dengan nilai lain
    void setTitikAkhir(Titik T2) {
        this.T2 = T2;
    }

    //mengembalikan nilai counterGaris
    static int getCounterGaris() {
        return counterGaris;
    }

    //menghitung panjang garis
    double getPanjangGaris() {
        return Math.sqrt(Math.pow(T2.getAbsis() - T1.getAbsis(), 2) + Math.pow(T2.getOrdinat() - T1.getOrdinat(), 2));
    }

    //menghitung gradien dari sebuah garis
    double getGradien() {
        return (T2.getOrdinat() - T1.getOrdinat()) / T2.getAbsis() - T1.getAbsis();
    }

    //menghitung titik tengah suatu garis
    Titik getTitikTengah() {
        double tengahX = (T1.getAbsis() + T2.getAbsis()) / 2;
        double tengahY = (T1.getOrdinat() + T2.getOrdinat()) / 2;
        return new Titik(tengahX, tengahY);
    }

    //mengecek apakah garis tersebut sejajar dengan sebuah garis lainnya
    boolean isSejajar(Garis A) {
        return this.getGradien() == A.getGradien();
    }

    //mengecek apakah garis tersebut tegak lurus dengan sebuah garis lainnya
    boolean isTegakLurus(Garis A) {
        return this.getGradien() * A.getGradien() == -1;
    }

    //mencetak koordinat titik awal dan titik akhir
    void printGaris() {
        System.out.println("Titik awal (" + T1.getAbsis() + "," + T1.getOrdinat() + "), Titik akhir (" + T2.getAbsis() + "," + T2.getOrdinat() + ")");
    }

    //menampilkan persamaan garis dalam bentuk string y = mx+ c
    void printPersamaanGaris() {
        System.out.println("y = " + getGradien() + "x + " + (T1.getOrdinat() - getGradien() * T1.getAbsis()));
    }
}