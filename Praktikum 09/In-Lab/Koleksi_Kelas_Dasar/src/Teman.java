/* Nama File    : Teman.java
 * Deskripsi    : Penerapan koleksi pada class dasar di bahasa Java
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 6 Mei 2026 */

import java.util.*;

public class Teman <T> {
    /* ******************* ATRIBUT ******************* */
    private int nbelm;
    private List<String> Lnama;

    /* ******************* METHOD ******************* */
    //Konstruktor
    public Teman() {
        this.nbelm = 0;
        this.Lnama = new ArrayList<>();
    }

    //Selektor
    public int getNbelm() {
        return this.nbelm;
    }

    public String getNama(int indeks) {
        return Lnama.get(indeks);
    }

    //Mutator
    public void setNama(int indeks, String nama) {
        Lnama.set(indeks, nama);
    }

    //Method lain
    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm = Lnama.size();
    }

    public void delNama(String nama) {
        Lnama.remove(nama);
        nbelm = Lnama.size();
    }

    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    public void gantiNama(String nama, String namaBaru) {
        //kamus
        int indeks;
        //algoritma
        indeks = Lnama.indexOf(nama);
        if (indeks != -1) {
            Lnama.set(indeks, namaBaru);
        }
    }

    public int countNama(String nama) {
        //kamus
        int count;
        //algoritma
        count = 0;
        for (String x : Lnama) {
            if (x.equals(nama)) {
                count++;
            }
        }
        return count;
    }

    // public void showTeman() {
    //     for (String nama : Lnama) {
    //         System.out.println(nama);
    //     }
    // }

    // public void showTeman() {
    //     //kamus
    //     int i;
    //     //algoritma
    //     for (i = 0; i < Lnama.size(); i++) {
    //         System.out.println(Lnama.get(i));
    //     }
    // }

    // public void showTeman() {
    //     for (String nama : Lnama) {
    //         System.out.println(nama);
    //     }
    // }

    public void showTeman() {
        //kamus
        int i;
        //algoritma
        for (i = 0; i < Lnama.size(); i++) {
            System.out.println(Lnama.get(i));
        }
    }

    // public void showTeman() {
    //     for (String nama : Lnama) {
    //         System.out.println(nama);
    //     }
    // }
}