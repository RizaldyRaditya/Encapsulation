/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author Rudi Erwanto
 */
public class EncapSiswa {
    private String Name;
    private String Address;
    private int Absen;
    
    public int getAbsen(){
        return Absen;
    }
    public String getName(){
        return Name;
    }
    public String getAddress(){
        return Address;
    }
    public void setAbsen(int newAbsen){
        Absen = newAbsen;
    }
    public void setName(String newName){
        Name = newName;
    }
    public void getAddress(String newAddress){
        Address = newAddress;
    }
}
