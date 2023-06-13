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
public class datasetPelanggan {
    private final ArrayList<String> idpelanggan;
    private final ArrayList<String> tablekode;
    private final ArrayList<String> nama;
    
    public datasetPelanggan(){
        idpelanggan = new ArrayList<>();
        tablekode = new ArrayList<>();
        nama = new ArrayList<>();
    }
    
    public void addIdPelanggan(String value){
        this.idpelanggan.add(value);
    }
    
    public ArrayList<String> getIdPelanggan(){
        return this.idpelanggan;
    }
    
    public void addTableKode(String value){
        this.tablekode.add(value);
    }
    
    public ArrayList<String> getTableKode(){
        return this.tablekode;
    }
    
    public void addNama(String value){
        this.nama.add(value);
    }
    
    public ArrayList<String> getNama(){
        return this.nama;
    }
    
    public void TambahPelanggan(String IdPelanggan, String TableKode, String Nama){
        addIdPelanggan(IdPelanggan);
        addTableKode(TableKode);
        addNama(Nama);
    }
}
