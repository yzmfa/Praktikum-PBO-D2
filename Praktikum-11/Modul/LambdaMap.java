/**
 * File: LambdaMap.java
 * Deskripsi: Implementasi lambda pada Map, digunakan untuk menampilkan key dan value.
 * Nama/NIM : Yusuf Zaenul Mustofa/24060122120021
 * Tanggal  : 29 Mei 2024
 */
import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060122120021", "Yusuf Zaenul Mustofa");
        mahasiswaMap.put("24060122120005", "Aditya Haidar Faishal");
        mahasiswaMap.put("24060122120033", "Zikry Alfahri Akram");
        mahasiswaMap.put("24060122140113", "Bima Aditya Aryono");

        // Lambda digunakan untuk menampilkan key dan value
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}
