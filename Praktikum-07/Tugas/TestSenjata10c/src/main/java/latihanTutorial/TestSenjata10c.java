/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package latihanTutorial;

/**
 *
 * @author yusuf
 */
public class TestSenjata10c {
    public static void main(String[] args){
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");
        
        System.out.print("AK47 Menembak 3x: "); ak47.menembak(3);
        System.out.print("M16 Menembak 1x: "); m16.menembak(1);
        
        System.out.print("AK47 Menusuk: " + ak47.menusuk());
        ak47.pasangBayonet();
        System.out.print("AK47 Menusuk: " + ak47.menusuk());
    }
}
