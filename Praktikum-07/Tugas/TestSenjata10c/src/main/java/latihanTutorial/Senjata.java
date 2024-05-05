/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanTutorial;

/**
 *
 * @author yusuf
 */
public class Senjata {
    private String bunyi;
    private boolean menusuk;
        
    public Senjata(String bunyi){
        this.bunyi = bunyi;
    }

    public String getBunyi() {
        return bunyi;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public boolean isMenusuk() {
        return menusuk;
    }

    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }
    
    public void menembak(int jumlah){
        for (int i = 0; i < jumlah; i++){
            System.out.print(getBunyi() + " ");
        }
        System.out.println("");
    }
    
    public void pasangBayonet(){
        setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
    
    public String menusuk(){
        if (isMenusuk()){
            return "Jleb!\n";
        } else {
            return "Gagal, belum pasang bayonet\n";  
        }
    }
}
