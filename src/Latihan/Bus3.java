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
public class Bus3 {
    public int Penumpang;
    public int maxPenumpang;
    
    public Bus3(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        Penumpang = 0;
    }
    public void addPenumpang(int Penumpang){
        int temp;
        temp = this.Penumpang + Penumpang;
        if(temp >  maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }
        else{
            this.Penumpang = temp;
        }
    }
    public void getPenumpang(int password){
        if(password == 24){
            System.out.println("Password BENAR");
        }
        else {
            System.out.println("Password SALAH");
        }
    }
        public void cetakPenumpang(){
        
            System.out.println("Penumpang BUS Sekarang = " +Penumpang);
            System.out.println("Maximal Penumpang yang seharusnya adalah = " +maxPenumpang);
    }
}
