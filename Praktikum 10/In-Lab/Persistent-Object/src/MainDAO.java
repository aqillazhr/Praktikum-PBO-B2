/* Nama File    : MainDAO.java
 * Deskripsi    : Main program untuk akses DAO
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 13 Mei 2026 */

public class MainDAO {
    public static void main(String[] args) {
        // membuat objek person
        Person person = new Person("Indra");
        
        // membuat objek DAOManager
        DAOManager m = new DAOManager();
        
        // menyimpan person ke database menggunakan MySQLPersonDAO
        m.setPersonDAO(new MySQLPersonDAO());
        try {
            m.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
