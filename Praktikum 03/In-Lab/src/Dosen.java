public class Dosen {
    /* *******************ATRIBUT******************* */
    private String nip;
    private String nama;
    private String prodi;

    /* *******************METHOD******************* */
    //konstruktor
    public Dosen() {
        nip = "###";
        nama = "###";
        prodi = "###";
    }

    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    //selektor
    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    //mutator
    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
}
