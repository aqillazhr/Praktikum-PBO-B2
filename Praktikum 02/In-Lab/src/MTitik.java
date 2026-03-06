/* Nama File    : MTitik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Shafa Aqilla Zahira
 * Tanggal      : 25 Februari 2026 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        T1.setAbsis(3); //mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); //mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); //mencetak koordinat T1 ke layar

        // *******************geser*******************
        T1.geser(3,4); //menggeser T1 sejauh (3,4)
        T1.printTitik(); //menampilkan koordinat T1 setelah digeser

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        Titik T3 = new Titik(); //membuat objek titik T3 (0,0)
        Titik T4 = new Titik(3,5); //
        T3.printTitik();
        T4.printTitik();

        Titik T5 = new Titik();
        T5.setAbsis(-10);
        T5.setOrdinat(-5);

        // *******************getKuadran*******************
        System.out.println("kuadran titik tersebut adalah " + T5.getKuadran());

        // *******************getJarakPusat*******************
        System.out.println("jarak suatu titik ke titik pusat adalah " + T4.getJarakPusat());

        // *******************getJarak*******************
        System.out.println("jarak suatu titik ke titik lain adalah " + T2.getJarak(T4));

        // *******************refleksiX*******************
        System.out.println("suatu titik yang direfleksikan ke sumbu X hasilnya menjadi ");
        T1.refleksiX();
        T1.printTitik();

        // *******************refleksiY*******************
        System.out.println("suatu titik yang direfleksikan ke sumbu Y hasilnya menjadi ");
        T1.refleksiY();
        T1.printTitik();

        // *******************getRefleksiX*******************
        System.out.println("suatu titik yang direfleksikan ke sumbu X hasilnya menjadi ");
        T2.getRefleksiX().printTitik();

        // *******************getRefleksiY*******************
        System.out.println("suatu titik yang direfleksikan ke sumbu Y hasilnya menjadi ");
        T4.getRefleksiY().printTitik();

    // *******************counterTitik*******************
        System.out.println("jumlah objek titik yang telah dibuat sebanyak " + Titik.getCounterTitik());
    }
}