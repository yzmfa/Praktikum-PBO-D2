/**
 * File     : Lingkaran.java
 * Deskripsi: Implementasi lingkaran sebagai BangunDatar
 * Nama/NIM : Yusuf Zaenul Mustofa/24060122120021
 * Tanggal  : 8 Mei 2024
 */

public class Lingkaran extends BangunDatar{
     private double jejari;
 
     public Lingkaran(double jejari){
         this.jejari = jejari;
     }
 
     public double hitungKeliling(){
         return 2 * jejari * 3.14;
     }
 }
 