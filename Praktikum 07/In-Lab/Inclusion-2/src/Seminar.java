/* Nama File    : Seminar.java
 * Deskripsi    : Penerapan polimorfisme inclusion pada Java
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 25 April 2026 */

public class Seminar {
    /* *******************ATRIBUT******************* */
    private Civitasakademika[] pesertas;
    private int banyakpeserta;
    
    /* *******************METHOD******************* */
    public Seminar() {
        pesertas = new Civitasakademika[100];
        banyakpeserta = 0;
    }

    public void registrasi(Civitasakademika c) {
        if (banyakpeserta < 100) {
            pesertas[banyakpeserta] = c;
            banyakpeserta++;
        }
        else {
            System.out.println("Peserta penuh");
        }
    }

    public int countPeserta() {
        return banyakpeserta;
    }

    public void tampilPeserta() {
        //kamus
        int i;
        //algoritma
        System.out.println("Daftar Peserta");
        for (i = 0; i < banyakpeserta; i++) {
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
        for (i = 0; i < banyakpeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                count++;
            }
        }
        return count;
    }
}