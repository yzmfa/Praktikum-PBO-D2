/*
 * File     : StackOfPoint.java
 * Deskripsi: Kelas turunan dari Stack dengan elemen yang bertipe Point
 * Nama/NIM : Yusuf Zaenul Mustofa/24060122120021
 * Tanggal  : 27 Maret 2024
 */

public class StackOfPoints extends Stack{
    /*Konstruktor */
    public StackOfPoints(){
    }
    
    /*Method lainnya */
    @Override
    public boolean cekElmtType(Object elmt){
        return (elmt instanceof Point);
    }
    
    @Override
    public void cetak(){
        int i;
        for(i=getSize()-1; i >= 0; i--){
            if(getElmt(i) instanceof Point P){
                P.cetak();
            }
        }
    }
    
    @Override
    public Point getElmt(int i){
       return (Point)super.getElmt(i);
    }
    
    @Override
    public Point getTop(){
       return (Point)super.getTop();
    }
}
