/*
 * File     : MBujurSangkar.java
 * Deskripsi: Kelas yang mengimplementasikan cara menghitung luas bujur sangkar
 * Nama/NIM : Yusuf Zaenul Mustofa/24060122120021
 * Tanggal  : 20 Maret 2024
 */

import java.util.Scanner;

class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar: ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi "+ sisi +" satuan adalah "+ bs.hitungLuas(sisi));
        scan.close();
    }
}
