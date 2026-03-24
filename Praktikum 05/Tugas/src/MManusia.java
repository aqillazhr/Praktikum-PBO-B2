/* Nama File    : MManusia.java
 * Deskripsi    : berisi pengaplikasian dari method class Manusia, Pengusaha, Petani, PNS, dan juga Interface Pajak
 * Pembuat      : Shafa Aqilla Zahira 24060124140146
 * Tanggal      : 22 Maret 2026 */

import java.time.*;

public class MManusia {
    public static void main(String[] args) { 
        PNS p1 = new PNS("Satriyo", LocalDate.of(2006, 04, 01), "Jl. Seroja", 15000000, "198302032006041002"); 
        Pengusaha pe1 = new Pengusaha("Adhy", LocalDate.of(2000, 01, 01),"Jl.Air",55000000,"000-556-773-212-000-5"); 
        Petani pt1 = new Petani("Nugraha", LocalDate.of(1977, 01, 9),"Jl. Bunga 9 Tembalang",5000000,"wonogiri"); 
        PNS p2 = new PNS("Panji", LocalDate.of(2010, 04, 01), null, 10000000.00, "198004212010041002"); 
        
        p2.setAlamat("Jl. Panorama 111 Tembalang"); 
        
        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns()); 
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS()); 
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha()); 
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani()); 
        
        System.out.println("\nPajak PNS p1 = " + p1.hitungPajak()); 
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak()); 
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak()); 
        
        System.out.println("\nMasa Kerja p1 = " + p1.hitungMasaKerja()); 
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja()); 
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja()); 
        
        System.out.println("\n-----INFO p1-----");
        p1.cetakInfo(); 

        System.out.println("\n-----INFO pe1-----");
        pe1.cetakInfo(); 

        System.out.println("\n-----INFO pt1-----");
        pt1.cetakInfo(); 
    } 
}
