/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pemesananmakanan;

/**
 *
 * @author ASUS
 */
public class PemesananMakanan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        user obj = new user();
        
        obj.setUserid("1");
        obj.setUsername("Ade");
        obj.setPassword("Setya");
        System.out.println("Userid : " + obj.getUserid());
        System.out.println("Username : "+ obj.getUsername());
        System.out.println ("Password : "+ obj.getPassword());
        
    }
    
}
