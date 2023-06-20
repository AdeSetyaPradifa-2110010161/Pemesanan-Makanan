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
public class datasetMenu {
    private final ArrayList<String> menuid;
    private final ArrayList<String> tipe;
    private final ArrayList<String> kategori;
    private final ArrayList<String> nama;
    private final ArrayList<String> harga;
    private final ArrayList<String> stok;
    
    public datasetMenu(){
        menuid = new ArrayList<>();
        tipe = new ArrayList<>();
        kategori = new ArrayList<>();
        nama = new ArrayList<>();
        harga = new ArrayList<>();
        stok = new ArrayList<>();
    }
    
    public void addMenuId(String value){
        this.menuid.add(value);
    }
    
    public ArrayList<String> getMenuId(){
        return this.menuid;
    }
    
    public void addTipe(String value){
        this.tipe.add(value);
    }
    
    public ArrayList<String> getTipe(){
        return this.tipe;
    }
    
    public void addKategori(String value){
        this.kategori.add(value);
    }
    
    public ArrayList<String> getKategori(){
        return this.kategori;
    }
        public void addNama(String value){
        this.nama.add(value);
    }
    
    public ArrayList<String> getNama(){
        return this.nama;
    }
    
    public void addHarga(String value){
        this.harga.add(value);
    }
    
    public ArrayList<String> getHarga(){
        return this.harga;
    }
    
     public void addStok(String value){
        this.stok.add(value);
    }
    
    public ArrayList<String> getStok(){
        return this.stok;
    }
    
    public void TambahMenu(String MenuId, String Tipe, String Kategori, String Nama, String Harga, String Stok){
        addMenuId(MenuId);
        addTipe(Tipe);
        addKategori(Kategori);
        addNama(Nama);
        addHarga(Harga);
        addStok(Stok);
}
}
