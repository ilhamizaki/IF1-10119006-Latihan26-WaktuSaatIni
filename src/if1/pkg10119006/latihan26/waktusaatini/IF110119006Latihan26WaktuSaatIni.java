/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119006.latihan26.waktusaatini;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF 1
 * NIM      : 10119006
 * Deskripsi Program : Menampilkan waktu saat ini
 */
public class IF110119006Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String pola = null;
        Locale lokal = null;
        String hasil = null;
        
        Date tanggalDanWaktu = new Date();
        pola = "EEEE, dd MMM yyyy H:mm:ss";
        hasil = IF110119006Latihan26WaktuSaatIni.tampilkanTanggalDanWaktu(
                tanggalDanWaktu, pola, lokal);
        System.out.println("Hari ini adalah hari : " + hasil);
        
    }
    
    protected static String tampilkanTanggalDanWaktu(Date tanggalDanWaktu,
                                                     String pola, Locale lokal) {
        String tanggalStr = null;
        SimpleDateFormat formatter = null;
        if (lokal == null) {
            formatter = new SimpleDateFormat(pola);
        } else {
            formatter = new SimpleDateFormat(pola, lokal);
        }
 
        tanggalStr = formatter.format(tanggalDanWaktu);
        return tanggalStr;    
    }
}
        
    
    
