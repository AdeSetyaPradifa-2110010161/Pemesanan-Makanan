/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pemesananmakanan;

/**
 *
 * @author ASUS
 */
public class order {
    private String orderid, tablekode, tipe, nama, jumlah, total, checkout, pelanggan;
    
    public order () {}
    
    public void setOrderid (String orderid){
        this.orderid = orderid;
    }
    
    public String getOrderid (){
        return this.orderid;
    }
    
    public void setNama (String nama){
        this.nama = nama;
    }
    
    public String getNama (){
        return this.nama;
    }
    
    public void setTablekode (String tablekode){
        this.tablekode = tablekode;
    }
    
    public String getTablekode (){
        return this.tablekode;
    }
    
    public void setTipe (String tipe){
        this.tipe = tipe;
    }
    
    public String getTipe (){
        return this.tipe;
    }
    
    public void setJumlah (String jumlah){
        this.jumlah = jumlah;
    }
    
    public String getJumlah (){
        return this.jumlah;
    }
    
    public void setTotal (String total){
        this.total = total;
    }
    
    public String getTotal (){
        return this.total;
    }
    
    public void setCheckout (String checkout){
        this.checkout = checkout;
    }
    
    public String getCheckout (){
        return this.checkout;
    }
    
    public void setPelanggan (String pelanggan){
        this.pelanggan = pelanggan;
    }
    
    public String getPelanggan (){
        return this.pelanggan;
    }
    
}
