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
    public Mahasiswa() {
        this.nim = "###";
        this.nama = "###";
        this.prodi = "###";
        this.listMatkul = new ArrayList<>();
    }

    public Mahasiswa(String nim, String nama, String prodi, Dosen dosenWali, Kendaraan kendaraan) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan (Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

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
        System.out.println("Data dosen wali\nNama: " + dosenWali.getNama() + "\nNIP: " + dosenWali.getNip() + "\nProdi: " + dosenWali.getProdi());
        System.out.println("Data kendaraan\nJenis: " + kendaraan.getJenis() + "\nNo plat: " + kendaraan.getnoPlat());
        System.out.println("Daftar matkul yang diambil oleh mahasiswa");
        int i;
        for (i = 0; i < listMatkul.size(); i++) {
            System.out.println(listMatkul.get(i).getNama());
        }
    }
}
