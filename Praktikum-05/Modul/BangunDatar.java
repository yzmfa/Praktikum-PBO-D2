/*
 * File     : BangunDatar.java
 * Deskripsi: Kelas abstrak, berisi abstraksi bangun datar
 * Nama/NIM : Yusuf Zaenul Mustofa/24060122120021
 * Tanggal  : 20 Maret 2024
 */

public abstract class BangunDatar {
    /*Atribut */
    protected double luas;

    /*Method */
    public abstract double hitungLuas(double sisi);

    /*Prosedur untuk mengeset nilai ke dalam variabel luas */
    public void setLuas(double l){
        luas = l;
    }

    /*Fungsi yang mengembalikan nilai luas */
    public double getLuas(){
        return luas;
    }
}
