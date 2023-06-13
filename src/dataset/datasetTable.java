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
public class datasetTable {
    private final ArrayList<String> tableno;
    private final ArrayList<String> tablekode;
    private final ArrayList<String> pelanggan;
    private final ArrayList<String> id;
    
    public datasetTable(){
        tableno = new ArrayList<>();
        tablekode = new ArrayList<>();
        pelanggan = new ArrayList<>();
        id = new ArrayList<>();
    }
    
    public void addTableNo(String value){
        this.tableno.add(value);
    }
    
    public ArrayList<String> getTableNo(){
        return this.tableno;
    }
    
    public void addTableKode(String value){
        this.tablekode.add(value);
    }
    
    public ArrayList<String> getTableKode(){
        return this.tablekode;
    }
    
    public void addPelanggan(String value){
        this.pelanggan.add(value);
    }
    
    public ArrayList<String> getPelanggan(){
        return this.pelanggan;
    }
    
    public void addId(String value){
        this.id.add(value);
    }
    
    public ArrayList<String> getId(){
        return this.id;
    }
    
    public void TambahTable(String TableNo, String TableKode, String Pelanggan, String Id){
        addTableNo(TableNo);
        addTableKode(TableKode);
        addPelanggan(Pelanggan);
        addId(Id);
    }    
}
