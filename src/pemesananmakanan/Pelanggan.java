/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pemesananmakanan;

/**
 *
 * @author ASUS
 */
public class Pelanggan {
    private String idpelanggan, tablekode, nama;
    
    public Pelanggan () {}
    
     public void setIdpelanggan (String idpelanggan){
        this.idpelanggan = idpelanggan;
    }
    
    public String getIdpelanggan (){
        return this.idpelanggan;
    }
    
    public void setTablekode (String tablekode){
        this.tablekode = tablekode;
    }
    
    public String getTablekode (){
        return this.tablekode;
    }
    
    public void setNama (String nama){
        this.nama = nama;
    }
    
    public String getNama (){
        return this.nama;
    }
    
}
