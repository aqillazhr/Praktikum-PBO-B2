/* Nama File    : Piaraan.java
 * Deskripsi    : Penerapan koleksi Queue pada class Piaraan
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 6 Mei 2026 */

import java.util.LinkedList;
import java.util.Queue;

public class Piaraan {
    /* ******************* ATRIBUT ******************* */
    private int nbelm;
    private Queue<Anabul> Lanabul;

    /* ******************* METHOD ******************* */
    //Konstruktor
    public Piaraan() {
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    //Selektor
    public int getNbelm() {
        return nbelm;
    }

    //Mutator
    public void enqueueAnabul(Anabul a) {
        Lanabul.add(a);
        nbelm++;
    }

    public boolean isMember(Anabul a) {
        return Lanabul.contains(a);
    }

    public Anabul getAnabul() {
        return Lanabul.peek();
    }

    public Anabul dequeueAnabul() {
        if (!Lanabul.isEmpty()) {
            nbelm--;
            return Lanabul.poll();
        }
        return null;
    }

    public void showAnabul() {
        for (Anabul a : Lanabul) {
            System.out.println(a.getNama());
        }
    }
}
