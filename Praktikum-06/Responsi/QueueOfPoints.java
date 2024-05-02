/*
 * File     : QueueOfPoints.java
 * Deskripsi: Kelas turunan dari Queue dengan elemen yang bertipe Point
 * Nama/NIM : Yusuf Zaenul Mustofa/24060122120021
 * Tanggal  : 27 Maret 2024
 */

public class QueueOfPoints extends Queue {
    /*Konstruktor */
    public QueueOfPoints(){
    }
    
    /*Method lainnya */
    @Override
    public boolean cekElmtType(Object elmt){
        return (elmt instanceof Point);
    }
    
    @Override
    public void cetak(){
        int i;
        for(i=0; i < getSize(); i++){
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
    public Point getHead(){
       return (Point)super.getHead();
    }
    
    @Override
    public Point getTail(){
       return (Point)super.getTail();
    }
}
