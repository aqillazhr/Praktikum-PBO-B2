/* Nama File    : CivitasAkademika.java
 * Deskripsi    : Penerapan polimorfisme inclusion pada Java
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 25 April 2026 */

public class Seminar {
    private CivitasAkademika[] pesertas;
    private int banyakPeserta;
    
    public Seminar() {
        pesertas = new CivitasAkademika[100];
        banyakPeserta = 0;
    }

    public void registrasi(CivitasAkademika c) {
        if (banyakPeserta < 100) {
            pesertas[banyakPeserta] = c;
            banyakPeserta++;
        }
        else {
            System.out.println("Peserta penuh");
        }
    }

    public int countPeserta() {
        return banyakPeserta;
    }

    public void tampilPeserta() {
        //kamus
        int i;
        //algoritma
        System.out.println("Daftar Peserta");
        for (i = 0; i < banyakPeserta; i++) {
            System.out.println(
                pesertas[i].getNomor() + " - " + pesertas[i].getNama()
            );
        }
    }

    public int countMahasiswa() {
        //kamus
        int count, i;
        //algoritma
        count = 0;
        for (i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                count++;
            }
        }
        return count;
    }
}