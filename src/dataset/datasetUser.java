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
public class datasetUser {
  private final ArrayList<String> userid;
  private final ArrayList<String> password;
  private final ArrayList<String> username;
    
    public datasetUser(){
        userid = new ArrayList<>();
        password = new ArrayList<>();
        username = new ArrayList<>();
    }
    
    public void addUserId(String value){
        this.userid.add(value);
    }
    
    public ArrayList<String> getUserId(){
        return this.userid;
    }
    
    public void addPassword(String value){
        this.password.add(value);
    }
    
    public ArrayList<String> getPassword(){
        return this.password;
    }
    
    public void addUsername(String value){
        this.username.add(value);
    }
    
    public ArrayList<String> getUsername(){
        return this.username;
    }
    
    public void TambahUser (String UserId, String Password, String Username){
        addUserId(UserId);
        addPassword(Password);
        addUsername(Username);
    }
}    
