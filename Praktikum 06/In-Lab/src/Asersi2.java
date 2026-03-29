/* Nama File    : Asersi2.java
 * Deskripsi    : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 25 Maret 2026 
 * 
 * Jawaban dari pertanyaan di modul
 * Secara konsep ada yang kurang tepat pada program ini, 
 * 1. Angka "1" tidak boleh digunakan sebagai nama variabel karena nama variabel tidak boleh berupa angka. Ini yang menyebabkan error.
 * 2. Penggunaan assertion kurang tepat karena assertion bisa dinonaktifkan sehingga tidak menjamin validasi input selalu dilakukan. Untuk validasi input seharusnya menggunakan exception*/

//class Lingkaran
class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert (jariJari > 0): "jari jari tidak boleh nol!!!";
        Lingkaran 1 = new Lingkaran(jariJari);
        double kelilingLingkaran = 1.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}