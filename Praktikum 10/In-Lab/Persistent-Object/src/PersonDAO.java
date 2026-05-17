/* Nama File    : PersonDAO.java
 * Deskripsi    : Interface untuk person access object
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 13 Mei 2026 */

public interface PersonDAO {
    //method untuk menyimpan person ke database
    public void savePerson(Person p) throws Exception;
}