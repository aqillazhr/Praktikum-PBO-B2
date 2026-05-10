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

    public Piaraan(Queue <Anabul> Lanabul) {
        this.Lanabul = Lanabul;
        this.nbelm = Lanabul.size();
    }

    //Selektor
    public int getNbelm() {
        return nbelm;
    }

    //Method lain
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

    public int countKucing() {
        // Kamus
        int count;
        // Algoritma
        count = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    public double bobotKucing() {
        // Kamus
        double total;
        // Algoritma
        total = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                total += ((Kucing) a).getBobot();
            }
        }
        return total;
    }

    public void showJenisAnabul() {
        for (Anabul a : Lanabul) {
            System.out.println(
                a.getNama() + " adalah " +
                a.getClass().getName()
            );
        }
    }

    
}
