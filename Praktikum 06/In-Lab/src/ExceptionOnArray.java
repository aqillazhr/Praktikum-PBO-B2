/* Nama File    : Asersi1.java
 * Deskripsi    : Program untuk menunjukkan asersi
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 25 Maret 2026
 * Berhasil dicompile dengan javac ExceptionOnArray.java dan dijalankan dengan java ExceptionOnArray, menghasilkan output
 * java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        at ExceptionOnArray.main(ExceptionOnArray.java:7)
clean up code... */

public class ExceptionOnArray {
    public static void main(String[] args) {
        //instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }
        catch(ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
        finally {
            System.out.println("clean up code...");
        }
    }
}
