/* Nama File    : Mahasiswa.java
 * Deskripsi    : Penerapan polimorfisme overloading pada Java
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 25 April 2026 */

public class Mahasiswa {
    /* *******************ATRIBUT******************* */
    String NIM;
    String Nama;
    String ProgramStudi;

    /* *******************METHOD******************* */
    //konstruktor
    public Mahasiswa() {
        this.NIM = "-999";
        this.Nama = "n/a";
        this.ProgramStudi = "n/a";
    }

    public Mahasiswa(String nim, String nama, String programStudi) {
        this.NIM = nim;
        this.Nama = nama;
        this.ProgramStudi = programStudi;
    }

    public Mahasiswa(Mahasiswa mahasiswa) {
        this.NIM = mahasiswa.NIM;
        this.Nama = mahasiswa.Nama;
        this.ProgramStudi = mahasiswa.ProgramStudi;
    }

    //selektor
    public String getNIM() {
        return this.NIM;
    }

    public String getNama() {
        return this.Nama;
    }

    public String getProgramStudi() {
        return this.ProgramStudi;
    }

    //mutator
    public void setProgramStudi () {
        this.ProgramStudi = "Kosong";
    }

    public void setProgramStudi(String P) {
        this.ProgramStudi = P;
    }

    public void setProgramStudi(Mahasiswa mhs) {
        this.ProgramStudi = mhs.ProgramStudi;
    }

    /* *******************APLIKASI******************* */
    public static void main(String[] args) {
        Mahasiswa M1 = new Mahasiswa();
        Mahasiswa M2 = new Mahasiswa("24060124140146", "Shafa Aqilla Zahira", "Informatika");
        Mahasiswa M3 = new Mahasiswa(M2);

        System.out.println("-----Mahasiswa 1-----");
        System.out.println("NIM: " + M1.getNIM());
        System.out.println("Nama: " + M1.getNama());
        System.out.println("Program Studi: " + M1.getProgramStudi());
        System.out.println();

        System.out.println("-----Mahasiswa 2-----");
        System.out.println("NIM: " + M2.getNIM());
        System.out.println("Nama: " + M2.getNama());
        System.out.println("Program Studi: " + M2.getProgramStudi());
        System.out.println();

        System.out.println("-----Mahasiswa 3-----");
        System.out.println("NIM: " + M3.getNIM());
        System.out.println("Nama: " + M3.getNama());
        System.out.println("Program Studi: " + M3.getProgramStudi());
        System.out.println();

        M1.setProgramStudi();
        M2.setProgramStudi("Teknik Elektro");
        M3.setProgramStudi(M2);

        System.out.println("-----setelah setProgramStudi-----");
        System.out.println("Program Studi M1: " + M1.getProgramStudi());
        System.out.println("Program Studi M2: " + M2.getProgramStudi());
        System.out.println("Program Studi M3: " + M3.getProgramStudi());
    }
}