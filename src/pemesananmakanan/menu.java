/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pemesananmakanan;

/**
 *
 * @author ASUS
 */
public class menu {
    private String menuid,tipe,kategori,nama,harga,stok;
    
    public menu (){}
    
    public void setMenuid (String menuid){
        this.menuid = menuid;
    }
    
    public String getMenuid (){
        return this.menuid;
    }
    
     public void setTipe (String tipe){
        this.tipe = tipe;
    }
    
    public String getTipe (){
        return this.tipe;
    }
    
     public void setKategori (String kategori){
        this.kategori = kategori;
    }
    
    public String getKategori (){
        return this.kategori;
    }
    
     public void setNama (String nama){
        this.nama = nama;
    }
    
    public String getNama (){
        return this.nama;
    }
    
     public void setHarga (String harga){
        this.harga = harga;
    }
    
    public String getHarga (){
        return this.harga;
    }
    
     public void setStok (String stok){
        this.stok = stok;
    }
    
    public String getStok (){
        return this.stok;
    }
}
