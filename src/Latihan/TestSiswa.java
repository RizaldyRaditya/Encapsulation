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
public class TestSiswa {
    public static void main(String[] args) {
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Rizaldy");
        siswa.setAbsen(36);
        siswa.getAddress("Malang");
        
        System.out.println("Name : " +siswa.getName()+ "\nAbsen : " +siswa.getAbsen()+ "\nAddress : " +siswa.getAddress());
    }
}
