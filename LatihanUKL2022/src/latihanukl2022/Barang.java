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
    import java.util.ArrayList;
public class Barang {

 private ArrayList<String> namaBarang = new ArrayList<String>();
 private ArrayList<Integer> stok = new ArrayList<Integer>();
 private ArrayList<Integer> harga = new ArrayList<Integer>();

 public Barang() {
 this.namaBarang.add("Martabak");
 this.stok.add(15);
 this.harga.add(15000);
 this.namaBarang.add("Ayam Geprek");
 this.stok.add(30);
 this.harga.add(12000);
 this.namaBarang.add("Milo Dingin");
 this.stok.add(20);
 this.harga.add(7000);
 }
 public int getJmlBarang(){
 return this.namaBarang.size();
 }
 public void setNamaBarang(String namaBarang ){
 this.namaBarang.add(namaBarang);
 }
 public String getNamaBarang(int idBarang){
 return this.namaBarang.get(idBarang);
 }

 public void setStok(int stok ){
 this.stok.add(stok);
 }
 public int getStok(int idBarang){
 return this.stok.get(idBarang);
 }
 public void editStok(int idBarang, int stok){
 this.stok.set(idBarang, stok);;
 }
 public void setHarga(int harga ){
 this.harga.add(harga);
 }
 public int getHarga(int idBarang){
 return this.harga.get(idBarang);
}
}
