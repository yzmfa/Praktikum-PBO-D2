/**
 * File: MapTest.java
 * Deskripsi: Program yang menggunakan Generic untuk pasangan Kunci-Nilai
 * Nama/NIM : Yusuf Zaenul Mustofa/24060122120021
 * Tanggal  : 8 Mei 2024
 */

import java.util.*;

public class MapTest {  public static void main(String[] args) {
    //kunci-> integer, nilai-> string
    Map<Integer, String> map = new HashMap<Integer, String>();

    //menempatkan elemen kunci dan nilai
    map.put(1, "satu");
    map.put(2, "dua");

    //mengambil elemen pertama
    System.out.println(map.get(1));

    //mengambil keseluruhan kunci sebagai objek collection Set
    Set<Integer> keys = map.keySet();

    //bagaimana iterasi untuk mengambil keseluruhan
    for (Integer key : keys){
        System.out.println(key + " : " + map.get(key));
    }
    // nilai dari kunci ? tulis pada laporan anda!
    // petunjuk gunakan iterasi seperti program ArrayListTest

    }                       
}




