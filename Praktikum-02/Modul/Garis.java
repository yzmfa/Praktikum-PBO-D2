/****************************************************************************************/
/* File      : Garis.java                                                               */
/* Deskripsi : Kelas Garis yang merupakan sebuah garis dengan titikAwal dan titik Akhir */
/* NIM/Nama  : 24060122120021/Yusuf Zaenul Mustofa                                      */
/* Tanggal   : 28 Februari 2024                                                         */
/****************************************************************************************/
public class Garis {
    /*Atribut */
    private Titik titikAwal;
    private Titik titikAkhir;

    /*Konstruktor */
    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }
    
    /*Method */
    public Titik getTitikAwal(){
        return this.titikAwal;
    }
    public Titik getTitikAkhir(){
        return this.titikAkhir;
    }
    public void setTitikAwal(Titik titikAwal){
        this.titikAwal = titikAwal;
    }
    public void setTitikAkhir(Titik titikAkhir){
        this.titikAkhir = titikAkhir;
    }

    public double getPanjang(){
        return Math.sqrt(Math.pow((titikAwal.getAbsis() - titikAwal.getAbsis()), 2) + Math.pow((titikAkhir.getOrdinat() - titikAwal.getOrdinat()), 2));
    }

    public double getGradien(){
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    public Garis getRefleksiY(){
        return new Garis(this.titikAwal.getRefleksiY(), this.titikAkhir.getRefleksiY());
    }

    public boolean isTegakLurus(){
        if (titikAwal.getAbsis() * titikAkhir.getAbsis() + titikAwal.getOrdinat() * titikAkhir.getOrdinat() == 0){
            return true;
        }
        else {
            return false;
        }

    }
}
