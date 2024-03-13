/*
 * File      : MPoligon.java
 * Deskripsi : Driver class untuk poligon dan persegi panjang
 * Nama/NIM  : Yusuf Zaenul Mustofa
 * Tanggal   : 13 Maret 2024
 */
package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        /*Persegi Panjang */
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang : " + persegi.hitungLuas());

        /*Segitiga */
        Segitiga segitiga = new Segitiga(5,5, 6, 3);
        segitiga.printInfo();
        System.out.println("Luas Segitiga : " + segitiga.hitungLuas());
        System.out.println("Keliling Segitiga : " + segitiga.hitungKeliling());
    }    
}
