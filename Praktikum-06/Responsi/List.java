/*
 * File     : List.java
 * Deskripsi: Kelas abstrak List dengan list dinamis
 * Nama/NIM : Yusuf Zaenul Mustofa/24060122120021
 * Tanggal  : 27 Maret 2024
 */
import java.util.ArrayList;

public abstract class List {
    /*Atribut */
    protected ArrayList<Object> list;
    
    /*Konstruktor */
    List(){
        list = new ArrayList<>();
    }
    
    /*Method lainnya */
    public int getSize(){
        return list.size();
    }
    
    public Object getElmt(int i){
        return list.get(i);
    }
    
    public abstract boolean cekElmtType(Object elmt);
    
    public void add(Object elmt) throws Exception{
        if(cekElmtType(elmt)){
            list.addLast(elmt);
        }else{
            throw new Exception("Type Elemen tidak sesuai!");
        }
    }
   
    public abstract void del();
    
    public abstract void cetak();
}
