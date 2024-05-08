/**
 * File: BangunDatarGeneric.java
 * Deskripsi: kelas konstruksi generic untuk BangunDatar
 * Nama/NIM : Yusuf Zaenul Mustofa/24060122120021
 * Tanggal  : 8 Mei 2024
 */
public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;

    public void set(T tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public T get() {
        return bangunDatar;
    }

    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }
}

/* Cobalah pada saat praktikum : Gantilah ‘T’ (dan segala T) pada BangunDatarGeneric.java diganti 
   dengan karakter yang lain seperti, T1,T2,T1234. Simpulkan apa yang anda lakukan ! */

/* Kesimpulan */

/* Ketika mengganti T, maka semua T di method juga harus diganti (Harus Sama!), jika tidak maka kode tidak berfungsi */
/* Jadi, perubahan dari T ke karakter lain seperti T1, T2, atau T1234 tidak akan mengubah cara kelas BangunDatarGeneric berfungsi. 
   Yang penting adalah menjaga konsistensi dalam penamaan di seluruh kelas atau metode. */

