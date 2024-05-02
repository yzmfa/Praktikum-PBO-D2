/*
 * File     : QueueOfNumber.java
 * Deskripsi: Kelas turunan dari Queue dengan elemen yang bertipe integer
 * Nama/NIM : Yusuf Zaenul Mustofa/24060122120021
 * Tanggal  : 27 Maret 2024
 */

public class QueueOfNumber extends Queue{
    /*Konstruktor */
    public QueueOfNumber(){
    }
    
    /*Method lainnya */
    @Override
    public boolean cekElmtType(Object elmt){
        return (elmt instanceof Integer);
    }
}
