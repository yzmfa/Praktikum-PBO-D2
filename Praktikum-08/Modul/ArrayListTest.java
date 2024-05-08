/**
 * File: ArrayListTest.java
 * Deskripsi: Program penggunaan objek ArrayList sebagai Collection class
 * Nama/NIM : Yusuf Zaenul Mustofa/24060122120021
 * Tanggal  : 8 Mei 2024
 */
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // Inisialisasi ArrayList yang hanya dapat berisi objek String
        ArrayList<String> strings = new ArrayList<String>();

        // Menambahkan elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");

        // Menghapus elemen
        strings.remove("praktikum");

        // Iterasi pada keseluruhan ArrayList
        for (String s : strings) {
            System.out.print(s + " ");
        }
    }
}
