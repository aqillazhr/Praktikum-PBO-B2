/* Nama File    : DAOManager.java
 * Deskripsi    : Pengelola DAO dalam program
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 13 Mei 2026 */

public class DAOManager {
    /* *******************ATRIBUT******************* */
    private PersonDAO personDAO;
    
    /* *******************METHOD******************* */
    //Mutator dan Selektor
    public void setPersonDAO(PersonDAO person) {
        personDAO = person;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}
