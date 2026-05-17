/* Nama File    : Person.java
 * Deskripsi    : Person database model
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 13 Mei 2026 */

import java.io.Serializable;

public class Person implements Serializable {
    /* *******************ATRIBUT******************* */
    private int id;
    private String name;

    /* *******************METHOD******************* */
    //Konstruktor untuk name
    public Person(String n) {
        name = n;
    }

    //Konstruktor untuk id dan name
    public Person(int i, String n) {
        id = i;
        name = n;
    }

    //Selektor untuk id dan name
    public int getId() {
        return id;
    }

    //Selektor untuk name
    public String getName() {
        return name;
    }
}
