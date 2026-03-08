/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 8 Februari 2026 */

import java.util.ArrayList;

public class Mahasiswa {
    /* *******************ATRIBUT******************* */
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /* *******************METHOD******************* */
    //konstruktor
    public Mahasiswa() {
        this.nim = "-";
        this.nama = "-";
        this.prodi = "-";
        this.listMatkul = new ArrayList<>();
        this.kendaraan = new Kendaraan();
    }

    public Mahasiswa(String nim, String nama, String prodi, String noPlat, String jenis) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
        this.kendaraan = new Kendaraan(noPlat, jenis);
    }

    //selektor
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public ArrayList<MataKuliah> getListMatkul() {
        return listMatkul;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    //mutator
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setListMatkul(ArrayList<MataKuliah> listMatkul) {
        this.listMatkul = listMatkul;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    //method lain
    public void addMatkul(MataKuliah newMatkul) {
        listMatkul.add(newMatkul);
    }

    public int getJumlahSKS() {
        //kamus
        int jumlahSKS;
        //algoritma
        jumlahSKS = 0;
        for (MataKuliah matkul: listMatkul) {
            jumlahSKS += matkul.getSks();
        }
        return jumlahSKS;
    }

    public int getJumlahMatkul() {
        return listMatkul.size();
    }

    public void printMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    public void printDetailMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Data Dosen Wali\nNama: " + dosenWali.getNama() + "\nNIP: " + dosenWali.getNip() + "\nProdi: " + dosenWali.getProdi());
        System.out.println("Data Kendaraan\nJenis: " + kendaraan.getJenis() + "\nNo plat: " + kendaraan.getNoPlat());
        System.out.println("Mata Kuliah yang Diambil:");
        int i;
        for (i = 0; i < listMatkul.size(); i++) {
            System.out.println(listMatkul.get(i).getNama());
        }
    }
}
