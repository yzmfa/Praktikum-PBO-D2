/*
 * File     : MLingkaran.java
 * Deskripsi: Implementasi cara menghitung luas lingkaran
 * Nama/NIM : Yusuf Zaenul Mustofa/24060122120021
 * Tanggal  : 20 Maret 2024
 */

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jejari lingkaran : ");
        double jejari = scan.nextDouble();
        Lingkaran l = new Lingkaran(jejari);
        System.out.println("Luas lingkaran dengan jejari " + jejari + " satuan adalah " + l.hitungLuas());
        scan.close();
    }
}
