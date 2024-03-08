/*
 * File      : InsufficientFundsException.java
 * Deskripsi : Eksepsi buatan sendiri, menolak mengambil saldo jika sisa saldo minimum $100.
 * Nama/NIM  : Yusuf Zaenul Mustofa/24060122120021
 * Tanggal   : 6 Maret 2024
 */
public class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message);
    }
}
