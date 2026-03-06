/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Shafa Aqilla Zahira
 * Tanggal      : 25 Februari 2026 */

public class Titik {
    /* *******************ATRIBUT******************* */
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /* *******************METHOD******************* */
    //konstruktor untuk membuat dengan nilai absis dan ordinat tertentu
    Titik(double absis, double ordinat) {
        this.absis = absis; //this yg di sini nunjuk ke atributnya
        this.ordinat = ordinat;
        counterTitik++;
    }

    //konstruktor untuk membuat titik (0,0)
    Titik() {
        this(0,0);
    }

    //mengembalikan nilai counterTitik
    static int getCounterTitik() {
        return counterTitik;
    }

    //mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    public void setAbsis(double x) {
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y) {
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //menghitung kuadran dari suatu titik
    public int getKuadran() {
        if (absis == 0 && ordinat == 0) {
            return 0;
        }
        else if (absis > 0 && ordinat > 0) {
            return 1;
        }
        else if (absis < 0 && ordinat > 0) {
            return 2;
        }
        else if (absis < 0 && ordinat < 0) {
            return 3;
        }
        else {
            return 4;
        }
    }

    //menghitung jarak dari titik ke titik pusat
    public double getJarakPusat() {
        return Math.sqrt(Math.pow(ordinat, 2) + Math.pow(absis, 2));
    }

    //menghitung jarak dari titik satu ke titik lain
    public double getJarak(Titik T) {
        return Math.sqrt(Math.pow(absis-T.getAbsis(), 2) + Math.pow(ordinat-T.getOrdinat(), 2));
    }

    public void refleksiX() {
        ordinat = -ordinat;
    }

    public void refleksiY() {
        absis = -absis;
    }

    public Titik getRefleksiX() {
        return new Titik (absis, -ordinat);
    }

    public Titik getRefleksiY() {
        return new Titik (-absis, ordinat);
    }

    //mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}