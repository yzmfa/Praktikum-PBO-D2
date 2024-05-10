/*
 * File     : Main.java
 * Deskripsi: Kelas utama untuk menguji kelas-kelas lainnya
 * Nama/NIM : Yusuf Zaenul Mustofa/24060122120021
 * Tanggal  : 10 Mei 2024
 */

 public class Main {
    public static void main(String[] args) {
        // Kamus
        Ulat K = new Ulat(); // Ulat bernama K
        Data<Kupu> anu = new Data<>(); // Data dengan tipe Kupu

        // Algoritma
        anu.setIsi(K); // Set isi data dengan Ulat K
        anu.getIsi().gerak(); // Panggil metode gerak dari isi data (ulat merayap)
      
        anu.setIsi(new Kepompong());// Set isi data dengan objek Kepompong
        anu.getIsi().gerak(); // Panggil metode gerak dari isi data (kepompong diam)

        anu.setIsi(new KupuDewasa());// Set isi data dengan objek KupuDewasa
        anu.getIsi().gerak(); // Panggil metode gerak dari isi data (kupu terbang)
    }
}
