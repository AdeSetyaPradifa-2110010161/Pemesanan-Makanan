/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pemesananmakanan;

/**
 *
 * @author ASUS
 */
public class kategori {
    private String kategori, tipe, nama;
    
    public kategori () {}
    
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
    
    public void setTipe (String tipe){
        this.tipe = tipe;
    }
    
    public String getTipe (){
        return this.tipe;
    }
}
