/********************************************************************************/
/* File      : MTitik.java                                                      */
/* Deskripsi : Kelas yang berisi main dari Titik                                */
/* NIM/Nama  : 24060122120021/Yusuf Zaenul Mustofa                              */
/* Tanggal   : 28 Februari 2024                                                 */
/********************************************************************************/

public class MTitik {
    public static void main(String[] args){
        Titik t1;
        Titik t2;
        Titik t3;
        Titik t4;
        Titik t5;

        t1 = new Titik(1,2);
        t2 = new Titik(3,4);
        t3 = new Titik(5,6);
    
        System.out.printf("t1(%.1f, %.1f)\n", t1.getAbsis(), t1.getOrdinat());
        System.out.printf("t2(%.1f, %.1f)\n", t2.getAbsis(), t2.getOrdinat());
        System.out.printf("t3(%.1f, %.1f)\n", t3.getAbsis(), t3.getOrdinat());
        System.out.printf("SetAbsis t1 = 5 dan setOrdinat t1 = 10\n");
        t1.setAbsis(5);
        t1.setOrdinat(10);
        System.out.printf("t1(%.1f, %.1f)\n", t1.getAbsis(), t1.getOrdinat());
        System.out.printf("Jarak t1 terhadap titik pusat : %.1f\n", t1.getJarakPusat());
        System.out.printf("Refleksi X titik t1\n");
        t1.refleksiX(t1.getOrdinat());
        System.out.printf("t1(%.1f, %.1f)\n", t1.getAbsis(), t1.getOrdinat());
        System.out.printf("Refleksi Y titik t2\n");
        t2.refleksiY(t2.getAbsis());
        System.out.printf("t2(%.1f, %.1f)\n", t2.getAbsis(), t2.getOrdinat());
        System.out.printf("t4 yaitu GetRefleksi X titik t2\n");
        t4 = t2.getRefleksiX();
        System.out.printf("t4(%.1f, %.1f)\n", t4.getAbsis(), t4.getOrdinat());
        System.out.printf("t5 yaitu GetRefleksi Y titik t3\n");
        t5 = t3.getRefleksiY();
        System.out.printf("t5(%.1f, %.1f)\n", t5.getAbsis(), t5.getOrdinat());
    }
}