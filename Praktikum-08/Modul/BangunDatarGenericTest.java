/**
 * File: BangunDatarGenericTest.java
 * Deskripsi: main class untuk generic bangun datar
 * Nama/NIM : Yusuf Zaenul Mustofa/24060122120021
 * Tanggal  : 8 Mei 2024
 */
public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("keliling lingkaran : " + bdg.hitungKeliling());
        System.out.println("tipe generic : " + bdg.get().getClass().getName());
    }
}

