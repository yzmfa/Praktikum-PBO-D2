/*
 * File     : Stack.java
 * Deskripsi: Kelas Abstrak Stack yang merupakan turunan dari List 
 * Nama/NIM : Yusuf Zaenul Mustofa/24060122120021
 * Tanggal  : 27 Maret 2024
 */

public abstract class Stack extends List {
    /*Konstruktor */
    protected Stack(){
    }
    
    /*Method lainnya */
    public Object getTop(){
        return getElmt(getSize()-1);
    }
    
    @Override
    public void del(){
        list.removeLast();
    }
    
    @Override
    public void cetak(){
        int i;
        for(i=getSize()-1; i >= 0; i--){
            System.out.println(getElmt(i));
        }
    }
}