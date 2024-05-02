/*
 * File     : StackOfNumber.java
 * Deskripsi: Kelas turunan dari Stack dengan elemen yang bertipe integer
 * Nama/NIM : Yusuf Zaenul Mustofa/24060122120021
 * Tanggal  : 27 Maret 2024
 */

public class StackOfNumber extends Stack {
    /*Konstruktor */
    public StackOfNumber(){
    }
    /*Method lainnya */
    @Override
    public boolean cekElmtType(Object elmt){
        return (elmt instanceof Integer);
    }
}
