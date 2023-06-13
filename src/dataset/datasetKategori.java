/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class datasetKategori {
  private final ArrayList<String> kategori;
  private final ArrayList<String> tipe;
  private final ArrayList<String> nama;
    
    public datasetKategori(){
        kategori = new ArrayList<>();
        tipe = new ArrayList<>();
        nama = new ArrayList<>();
    }
    
    public void addKategori(String value){
        this.kategori.add(value);
    }
    
    public ArrayList<String> getKategori(){
        return this.kategori;
    }
    
    public void addTipe(String value){
        this.tipe.add(value);
    }
    
    public ArrayList<String> getTipe(){
        return this.tipe;
    }
    
    public void addNama(String value){
        this.nama.add(value);
    }
    
    public ArrayList<String> getNama(){
        return this.nama;
    }
    
    public void TambahKategori(String Kategori, String Tipe, String Nama){
        addKategori(Kategori);
        addTipe(Tipe);
        addNama(Nama);
    }
}
