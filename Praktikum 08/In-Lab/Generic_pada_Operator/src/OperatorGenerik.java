/* Nama File    : OperatorGenerik.java
 * Deskripsi    : Penerapan generik pada operator di bahasa Java
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 29 April 2026 */

public class OperatorGenerik {
    /* *******************ATRIBUT******************* */

    /* *******************METHOD******************* */
    public static <G> void Tukar(Datum<G> a, Datum<G> b) {
        G temp = a.isi;
        a.isi = b.isi;
        b.isi = temp;
    }

    public static <T extends Kucing> double Bobot2(T a, T b) {
        return a.getBobot() + b.getBobot();
    }

    /* *******************MAIN PROGRAM******************* */
    public static void main(String[] args) {
        //Kamus
        double totalBobot;

        //Algoritma
        Datum<Integer> A = new Datum<>(3);
        Datum<Integer> B = new Datum<>(6);
        Datum<Anabul> C = new Datum<>(new Kucing("Kuceng", 10.0));
        Datum<Anabul> D = new Datum<>(new Anjing("Anjeng"));

        System.out.println("-----Penerapan prosedur Tukar-----");
        System.out.println("Sebelum Tukar");
        System.out.println("A = " + A.getIsi());
        System.out.println("B = " + B.getIsi());

        System.out.println("Setelah Tukar");
        OperatorGenerik.Tukar(A, B);
        System.out.println("A = " + A.getIsi());
        System.out.println("B = " + B.getIsi());
        System.out.println();

        System.out.println("Sebelum Tukar");
        C.isi.Gerak();
        C.isi.Bersuara();
        D.isi.Gerak();
        D.isi.Bersuara();
        System.out.println();

        System.out.println("Setelah Tukar");
        OperatorGenerik.Tukar(C, D);
        C.isi.Gerak();
        C.isi.Bersuara();
        D.isi.Gerak();
        D.isi.Bersuara();
        System.out.println();

        System.out.println("-----Penerapan fungsi Bobot2-----");
        Anggora A1 = new Anggora("Gorun", 20.5);
        System.out.println("Nama kucing 1: " + A1.getNama());
        System.out.println("Bobot kucing 1: " + A1.getBobot());

        Kembangtelon K1 = new Kembangtelon("Cuwwi", 30.0);
        System.out.println("Nama kucing 2: " + K1.getNama());
        System.out.println("Bobot kucing 2: " + K1.getBobot());
        
        totalBobot = OperatorGenerik.Bobot2(A1, K1);
        System.out.println("Jumlah bobot = " + totalBobot);
    }
}
