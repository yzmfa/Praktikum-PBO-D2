/*
 * File     : Lingkaran.java
 * Deskripsi: Kelas implementasi IArea berupa cara menghitung luas lingkaran
 * Nama/NIM : Yusuf Zaenul Mustofa/24060122120021
 * Tanggal  : 20 Maret 2024
 */

import static java.lang.Math.PI;

class Lingkaran implements IArea{
    /*Atribut */
    private double jejari;

    /*Method */
    /*Konstruktor */
    public Lingkaran(double r){
        jejari = r;
    }

    /*Fungsi yang menghitung dan mengembalikan nilai luas */
    public double hitungLuas(){
        return PI * jejari * jejari;
    }
}
