/*
 * File      : AngkaSialException.java
 * Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
 * Nama/NIM  : Yusuf Zaenul Mustofa/24060122120021
 * Tanggal   : 6 Maret 2024
 */
public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial!!!");
    }
}
