/********************************************************************************/
/* File      : MGaris.java                                                      */
/* Deskripsi : Kelas yang berisi main dari Garis                                */
/* NIM/Nama  : 24060122120021/Yusuf Zaenul Mustofa                              */
/* Tanggal   : 28 Februari 2024                                                 */
/********************************************************************************/
public class MGaris {
    public static void main(String[] args) {
        Titik t1;
        Titik t2;
        Titik t3;
        Titik t4;
        Garis g1;
        Garis g2;

        t1 = new Titik(1, 2);
        t2 = new Titik(3, 4);
        g1 = new Garis(t1, t2);

        System.out.printf("Titik Awal: %.1f, %.1f\n", g1.getTitikAwal().getAbsis(), g1.getTitikAwal().getOrdinat());
        System.out.printf("Titik Akhir: %.1f, %.1f\n", g1.getTitikAkhir().getAbsis(), g1.getTitikAkhir().getOrdinat());
        
        t3 = new Titik(5, 6);
        t4 = new Titik(7, 8);
        g1.setTitikAwal(t3);
        g1.setTitikAkhir(t4);
        System.out.printf("Titik Awal Baru: %.1f, %.1f\n", g1.getTitikAwal().getAbsis(), g1.getTitikAwal().getOrdinat());
        System.out.printf("Titik Akhir Baru: %.1f, %.1f\n", g1.getTitikAkhir().getAbsis(), g1.getTitikAkhir().getOrdinat());
        
        System.out.printf("Panjang garis: %.1f\n", g1.getPanjang());
        
        System.out.printf("Gradien garis: %.1f\n", g1.getGradien());
        
        g2 = g1.getRefleksiY();
        
        System.out.printf("Titik Awal Setelah Refleksi Y: %.1f, %.1f\n", g2.getTitikAwal().getAbsis(), g2.getTitikAwal().getOrdinat());
        System.out.printf("Titik Akhir Setelah Refleksi Y: %.1f, %.1f\n", g2.getTitikAkhir().getAbsis(), g2.getTitikAkhir().getOrdinat());

        System.out.println("Apakah garis tegak lurus? " + g1.isTegakLurus());
    }
}
