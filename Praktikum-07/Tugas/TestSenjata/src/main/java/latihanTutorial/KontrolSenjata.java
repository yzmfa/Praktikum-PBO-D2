/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanTutorial;

/**
 *
 * @author yusuf
 */
public class KontrolSenjata {
    Senjata senjata;
    
    public KontrolSenjata(Senjata s){
       senjata = s;
    }
    
    public boolean isAdaPeluru(){
        return senjata.getPeluru() > 0;
    }
    
    public void isiPeluru(int jumPeluru){
        senjata.setPeluru(senjata.getPeluru() + jumPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jumPeluru);
    }
    
    public void menembak(int jumlah){
        System.out.println(">> Siap menembak " + jumlah + " kali");
        if (isAdaPeluru()){
            for (int i = 0; i < jumlah; i++){
                if (senjata.getPeluru() > 0){
                    System.out.print(senjata.getBunyi() + "\n");
                    senjata.setPeluru(senjata.getPeluru() - 1);
                }
                else {
                    System.out.println("Gagal tembak, Peluru Habis");
                }
            }
            System.out.println(">> Peluru sisa: " + senjata.getPeluru());
        }
        else {
            System.out.println("Peluru Habis");
        }
    }
    
    public void pasangBayonet(){
        senjata.setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
    
    public String menusuk(){
        if (senjata.isMenusuk()){
            return "Jleb! \n";
        } else {
            return "Gagal, belum pasang bayonet\n";  
        }
    }
}
