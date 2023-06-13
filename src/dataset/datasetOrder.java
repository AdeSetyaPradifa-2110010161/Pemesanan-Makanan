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
public class datasetOrder {
    private final ArrayList<String> orderid;
    private final ArrayList<String> tablekode;
    private final ArrayList<String> tipe;
    private final ArrayList<String> nama;
    private final ArrayList<String> jumlah;
    private final ArrayList<String> total;
    private final ArrayList<String> checkout;
    private final ArrayList<String> pelanggan;
    
    
    public datasetOrder(){
        orderid = new ArrayList<>();
        tablekode = new ArrayList<>();
        tipe = new ArrayList<>();
        nama = new ArrayList<>();
        jumlah = new ArrayList<>();
        total = new ArrayList<>();
        checkout = new ArrayList<>();
        pelanggan = new ArrayList<>();
    }
    
    public void addOrderId(String value){
        this.orderid.add(value);
    }
    
    public ArrayList<String> getOrderId(){
        return this.orderid;
    }
    
    public void addTableKode(String value){
        this.tablekode.add(value);
    }
    
    public ArrayList<String> getTableKode(){
        return this.tablekode;
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
    
    public ArrayList<String> nama(){
        return this.nama;
    }
    
    public void addJumlah(String value){
        this.jumlah.add(value);
    }
    
    public ArrayList<String> getJumlah(){
        return this.jumlah;
    }
    
     public void addTotal(String value){
        this.total.add(value);
    }
    
    public ArrayList<String> getTotal(){
        return this.total;
    }
    
        public void addCheckOut(String value){
        this.checkout.add(value);
    }
    
    public ArrayList<String> getCheckOut(){
        return this.checkout;
    }
    
     public void addPelanggan(String value){
        this.pelanggan.add(value);
    }
    
    public ArrayList<String> getPelanggan(){
        return this.pelanggan;
    }
    
    public void TambahOrder(String OrderId, String TableKode, String Tipe, String Nama, String Jumlah, String Total, String CheckOut, String Pelanggan){
        addOrderId(OrderId);
        addTableKode(TableKode);
        addTipe(Tipe);
        addNama(Nama);
        addJumlah(Jumlah);
        addTotal(Total);
        addCheckOut(CheckOut);
        addPelanggan(Pelanggan);
                
}
}
