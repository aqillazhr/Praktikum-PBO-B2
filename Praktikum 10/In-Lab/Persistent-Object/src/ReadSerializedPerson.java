/* File         : ReadSerializedPerson.java
 * Deskripsi    : Program untuk serialisasi objek Person
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 13 Mei 2026 */

import java.io.*;

public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person person = null;

        //deserialisasi objek person dari file person.ser
        try{
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person) s.readObject();
            s.close();

            System.out.println("serialized person name = " + person.getName());
        } catch (Exception ioe) {
            ioe.printStackTrace();
        }
    }
}
