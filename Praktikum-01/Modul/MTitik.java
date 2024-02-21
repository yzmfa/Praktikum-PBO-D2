/********************************************************************************/
/* File      : MTitik.java                                                      */
/* Deskripsi : Kelas yang berisi main dari Titik                                */
/* NIM/Nama  : 24060122120021/Yusuf Zaenul Mustofa                              */
/* Tanggal   : 21 Februari 2024                                                 */
/********************************************************************************/

public class MTitik {
    public static void main(String[] args){
        Titik t1;
        Titik t2;
        Titik t3;

        t1 = new Titik(1,2);
        t2 = new Titik(3,4);
        t3 = new Titik(5,6);
        
        int counterTitik = Titik.getCounterTitik();

        System.out.printf("Jumlah objek titik : %d\n", counterTitik);
        System.out.printf("t1(%.1f, %.1f)\n", t1.getAbsis(), t1.getOrdinat());
        System.out.printf("t2(%.1f, %.1f)\n", t2.getAbsis(), t2.getOrdinat());
        System.out.printf("t3(%.1f, %.1f)\n", t3.getAbsis(), t3.getOrdinat());
    }
}