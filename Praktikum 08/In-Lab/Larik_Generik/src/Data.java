/* Nama File    : Data.java
 * Deskripsi    : Penerapan generik di bahasa Java
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 1 Mei 2026 */

public class Data <T>{
    /* *******************ATRIBUT******************* */
    private T[] ruang;
    private int banyak;
    
    /* *******************METHOD******************* */
    //Konstruktor
    public Data() {
        ruang = (T[]) new Object[100];
        banyak = 0;
    }

    //selektor
    public T getIsi(int posisi) {
        if (posisi >= 0  && posisi < banyak) {
            return ruang[posisi];
        }
        return null;
    }

    public int getSize() {
        return this.banyak;
    }

    //mutator
    public void setIsi(int posisi, T objek) {
        if (posisi >= 0 && posisi < 100) {
            ruang[posisi] = objek;
            if (posisi >= banyak) {
                banyak = posisi+1;
            }
        }
    }

    /* *******************MAIN PROGRAM******************* */
    public static void main(String[] args) {
        Data<Anabul> data = new Data<>();

        data.setIsi(0, new Kucing("Gorun Comel", 200.5));
        data.setIsi(1, new Anjing("Piko"));
        data.setIsi(2, new Burung("Pika"));

        System.out.println("Jumlah elemen:");
        System.out.println(data.getSize());
        System.out.println();

        System.out.println("Isi index 0:");
        data.getIsi(0).Gerak();
        System.out.println();

        System.out.println("Isi index 1:");
        data.getIsi(1).Bersuara();
        System.out.println();

        System.out.println("Isi index 2:");
        data.getIsi(2).Gerak();
    }
}