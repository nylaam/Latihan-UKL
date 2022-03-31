/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanukl2022;

import java.util.ArrayList;

/**
 *
 * @author WINDOWS 10
 */
public class Member implements User{
    
    private ArrayList<String> namaMember = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();
    
    //konstraktor : method yg namanya sama dengan kelas itu sendiri & dia akan dijalankan ketika dieksekusi
    public Member(){
        this.namaMember.add("Nesya");
        this.alamat.add("Malang");
        this.telepon.add("081234759087");
        this.saldo.add(290000);
        
        this.namaMember.add("Nayla");
        this.alamat.add("Kepanjen");
        this.telepon.add("081222318396");
        this.saldo.add(500000);
        
        this.namaMember.add("Nasywa");
        this.alamat.add("Kepanjen");
        this.telepon.add("083198302897");
        this.saldo.add(410000);
        
    }
    
    public void setSaldo(int saldo){
 this.saldo.add(saldo);
 }
 public int getSaldo(int idMember){
 return this.saldo.get(idMember);
 }
 public void editSaldo(int idMember, int saldo){
 this.saldo.set(idMember, saldo);;
 }
 public int getJmlMember(){
 return this.saldo.size();
 } 

    @Override
    public void setNama(String namaMember) {
        this.namaMember.add(namaMember);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idMember) {
        return this.namaMember.get(idMember);
    }

    @Override
    public String getAlamat(int idMember) {
        return this.alamat.get(idMember);
    }

    @Override
    public String getTelepon(int idMember) {
        return this.telepon.get(idMember);
    }
    
}
