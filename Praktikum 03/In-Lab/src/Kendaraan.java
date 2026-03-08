public class Kendaraan {
    /* *******************ATRIBUT******************* */
    private String noPlat;
    private String jenis;

    /* *******************METHOD******************* */
    //konstruktor
    public Kendaraan() {
        this.noPlat = "###";
        this.jenis = "jenis";
    }

    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    //selektor
    public String getnoPlat() {
        return noPlat;
    }

    public String getJenis() {
        return jenis;
    }

    //mutator
    public void setnoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}
