/********************************************************************************/
/* File      : Titik.java                                                       */
/* Deskripsi : Kelas Titik yang merupakan sebuah titik dengan absis dan ordinat */
/* NIM/Nama  : 24060122120021/Yusuf Zaenul Mustofa                              */
/* Tanggal   : 28 Februari 2024                                                 */
/********************************************************************************/

public class Titik{
    /*Atribut*/
    private double absis;
    private double ordinat;
    //static int numberOfPoints; 

    /*Konstruktor*/
    /*Membuat objek tiitk dengan inisialisasi nilai absis dan ordinat */
    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
    }

    /*Membuat objek titik dengan inisialisasi absis 0 dan ordinat 0 */
    public Titik(){
        this(0,0);
    }

    /*Method */
    /*Fungsi selektor untuk mendapatkan nilai atribut ordinat*/
    public double getAbsis(){
        return this.absis;
    }
    /*Fungsi selektor untuk mendapatkan nilai atribut ordinat */
    public double getOrdinat(){
        return this.ordinat;
    }
    /*Prosedur untuk mengeset nilai atribut absis dengan nilai yang baru*/ 
    public void setAbsis(double absis){
        this.absis = absis;
    }
    /*Prosedur untuk mengeset nilai atribut ordinat dengan nilai yang baru */
    public void setOrdinat(double ordinat){
        this.ordinat = ordinat;
    }
    /*Fungsi selektor untuk menghitung jarak sebuah titik dengan titik pusat */
    public double getJarakPusat(){
        return Math.sqrt(Math.pow(this.absis,2) + Math.pow(this.ordinat, 2));
    }
    /*Prosedur untuk melakukan pencerminan titik terhadap sumbu X */    
    public void refleksiX(double ordinat){
        this.ordinat = ordinat*(-1);
    }
    /*Prosedur untuk melakukan pencerminan titik terhadap sumbu Y */    
    public void refleksiY(double absis){
        this.absis = absis*(-1);
    }
    /*Fungsi selektor untuk menghasilkan titik baru yang merupakan hasil pencerminan terhadap sumbu X */
    public Titik getRefleksiX(){
        return new Titik(absis, ordinat*(-1));
    }
    /*Fungsi selektor untuk menghasilkan titik baru yang merupakan hasil pencerminan terhadap sumbu X */
    public Titik getRefleksiY(){
        return new Titik(absis*(-1), ordinat);
    }
}