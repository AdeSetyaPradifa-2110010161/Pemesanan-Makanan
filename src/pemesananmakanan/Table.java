/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pemesananmakanan;

/**
 *
 * @author ASUS
 */
public class Table {
    private String tableno, tablekode, pelanggan,id;
    
    public Table (){}
 
     public void setTableno (String tableno){
        this.tableno = tableno;
    }
    
    public String getTableno (){
        return this.tableno;
    }
    
     public void setTablekode (String tablekode){
        this.tablekode = tablekode;
    }
    
    public String getTablekode (){
        return this.tablekode;
    }
    
     public void setPelanggan (String pelanggan){
        this.pelanggan = pelanggan;
    }
    
    public String getPelanggan (){
        return this.pelanggan;
    }
    
     public void setId (String id){
        this.id = id;
    }
    
    public String getId (){
        return this.id;
    }
    
}
