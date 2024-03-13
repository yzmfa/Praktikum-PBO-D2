/*
 * File      : PersegiPanjang.java
 * Deskripsi : Representasi dasar dari objek persegi panjang, turunan kelas poligon
 * Nama/NIM  : Yusuf Zaenul Mustofa
 * Tanggal   : 13 Maret 2024
 */

package org.bangundatar;

import org.poligon.Poligon;

public class PersegiPanjang extends Poligon{
    /*Atribut */
    private double panjang, lebar;

    /*Method */
    /*Konstruktor */
    public PersegiPanjang(double panjang, double lebar, int jumlahSisi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }

    /*Fungsi untuk menghitung luas persegi panjang */
    public double hitungLuas(){
        return panjang * lebar;
    }

    /*Prosedur untuk mengetahui jumlah sisi persegi panjang */
    public void printInfo(){
        System.out.println("Bangun Persegi Panjang bersisi " + this.getJumlahSisi());
    }
}
