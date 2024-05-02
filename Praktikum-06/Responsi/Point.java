/*
 * File     : Point.java
 * Deskripsi: Kelas Point dengan atribut absis dan ordinat
 * Nama/NIM : Yusuf Zaenul Mustofa/24060122120021
 * Tanggal  : 27 Maret 2024
 */

public class Point {
    /*Atribut */
    private double absis;
    private double ordinat;
      
    /*Konstruktor */
    public Point(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
    }
    
    public Point(){
        this(0,0);
    }
    
    /*Method lainnya */
    public double getOrdinat(){
        return ordinat;
    }
    
    public double getAbsis(){
        return absis;
    }

    public void setAbsis(double absis){
        this.absis = absis;
    }
    
    public void setOrdinat(double ordinat){
        this.ordinat = ordinat;
    }
    
    public void cetak(){
        System.out.println("(" + absis + "," + ordinat + ")");
    }
}
