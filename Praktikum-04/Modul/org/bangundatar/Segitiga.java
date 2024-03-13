/*
 * File      : Segitiga.java
 * Deskripsi : Representasi dasar dari objek segitiga, turunan kelas poligon
 * Nama/NIM  : Yusuf Zaenul Mustofa
 * Tanggal   : 13 Maret 2024
 */
package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
    /*Atribut */
    private double sisi1, sisi2, sisi3;

    /*Method */
    /*Konstruktor */
    public Segitiga(double sisi1, double sisi2, double sisi3, int jumlahSisi){
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
        this.jumlahSisi = jumlahSisi;
    }

    /*Fungsi untuk menghitung luas segitiga */
    public double hitungLuas(){
        return Math.sqrt(((sisi1 + sisi2 + sisi3) / 2) * (((sisi1 + sisi2 + sisi3) / 2) - sisi1) * (((sisi1 + sisi2 + sisi3) / 2) - sisi2) * (((sisi1 + sisi2 + sisi3) / 2) - sisi3));
    }

    /*Fungsi untuk menghitung keliling segitiga */
    public double hitungKeliling(){
        return sisi1 + sisi2 + sisi3;
    }

    /*Prosedur untuk mengetahui jumlah sisi segitiga */
    public void printInfo(){
        System.out.println("Bangun Segitiga bersisi " + this.getJumlahSisi());
    }
}
