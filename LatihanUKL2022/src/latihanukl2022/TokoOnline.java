/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanukl2022;

/**
 *
 * @author WINDOWS 10
 */
public class TokoOnline {
    public static void main(String[] args) {
        Member m = new Member();
        Karyawan k = new Karyawan();
        Barang b = new Barang();
        Transaksi t = new Transaksi();
        Laporan l = new Laporan();
        l.laporan(b);
        l.laporan(m);
        l.laporan(t, b);
        t.prosesTransaksi(m, t, b);
        l.laporan(t, b);
        l.laporan(b);
        l.laporan(m);
                
        // TODO code application logic here
    }
    
}
