/* Nama File    : AngkaSialException.java
 * Deskripsi    : Eksepsi buatan sendiri, menolak masukan angka 13
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 25 Maret 2026 */

public class AngkaSialException extends Exception{
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}
