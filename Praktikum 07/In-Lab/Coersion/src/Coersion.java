/* Nama File    : Coersion.java
 * Deskripsi    : Penerapan polimorfisme coersion pada Java
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 25 April 2026 */

public class Coersion {
    public static void main(String[] args) throws Exception {
        int J = 65;
        char K = (char) J;
        double L = (double) K;
        int nilaiAwal = (int) L;

        System.out.println("Nilai J: " + J);
        System.out.println("Nilai K: " + K);
        System.out.println("Nilai L: " + L);
        System.out.println("Nilai Awal: " + nilaiAwal);

        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);
        Integer A = Integer.parseInt(S);
        String T = Integer.toString(A);
        System.out.println("Nilai S: " + S);
        System.out.println("Nilai Z: " + Z);
        System.out.println("Nilai A: " + A);
        System.out.println("Nilai T: " + T);

        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("Nilai R: " + R);
        System.out.println("Nilai D: " + D);

    }
}
