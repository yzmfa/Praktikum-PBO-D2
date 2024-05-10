/*
 * File     : Data.java
 * Deskripsi: Kelas generik Data dengan tipe T untuk menyimpan objek
 * Nama/NIM : Yusuf Zaenul Mustofa/24060122120021
 * Tanggal  : 10 Mei 2024
 */

 public class Data<T> {
    // Kelas generik dengan tipe T
    private T isi;

    public T getIsi() {
        return isi;
    }

    public void setIsi(T x) {
        isi = x;
    }
}
