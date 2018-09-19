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
public class Bus {

    public int Penumpang;
    public int maxPenumpang;
    
    public Bus(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        Penumpang = 0;
    }

    
    public void addPenumpang(int Penumpang){
        int temp;
        temp = this.Penumpang+Penumpang;
        if(temp >= maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.Penumpang = temp;
        }
    }
 
    public void cetak() {
        System.out.println("Penumpang BUS sekarang adalah " +Penumpang);
        System.out.println("Penumpang maximal seharusnya adalah " +maxPenumpang);
    }
}
