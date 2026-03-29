/* Nama File    : AngkaSial.java
 * Deskripsi    : Program penggunaan exception buatan sendiri
   Pengenalan klausa 'throw' dan 'throws'
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 25 Maret 2026 
   
   Output:
10 bukan angka sial
jangan memasukkan angka 13 karena angka sial !!!
hati-hati memasukkan angka!!!
   
   Jawaban pertanyaan dari modul
   Baris ke 12 tidak dieksekusi ketika terjadi exception karena saat angka 13 dimasukkan, program langsung menjalankan throw dan menghentikan eksekusi method tanpa menjalankan perintah setelahnya, dan alur program pindah ke blok catch. Jadi ketika menginput angka 13 maka langsung lempar ke exception dan program keluar dari method di saat itu lalu masuk ke blok catch.
   Baris ke 21 dieksekusi karena setelah exception dilempar, program masuk ke blok catch untuk menangani exception itu, jadi perintah di blok catch dijalankan*/

public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial"); //ini baris ke 12
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) { //ini baris ke 21
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}
