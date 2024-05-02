/*
 * File     : Queue.java
 * Deskripsi: Kelas Abstrak Queue yang merupakan turunan dari List 
 * Nama/NIM : Yusuf Zaenul Mustofa/24060122120021
 * Tanggal  : 27 Maret 2024
 */

public abstract class Queue extends List {
    /*Konstruktor */
    public Queue(){
    }
    
    /*Method lainnya */
    public Object getHead(){
        return getElmt(0);
    }
    
    public Object getTail(){
        return getElmt(getSize()-1);
    }
     
    @Override
    public void del(){
        list.removeFirst();
    }
    
    @Override
    public void cetak(){
        int i;
        for(i=0; i < getSize(); i++){
            System.out.println(getElmt(i));
        }
    }
}