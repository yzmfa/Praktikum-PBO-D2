/*
 * File     : MList.java
 * Deskripsi: Kelas Main yang merupakan driver dari kelas List dan turunannya
 * Nama/NIM : Yusuf Zaenul Mustofa/24060122120021
 * Tanggal  : 27 Maret 2024
 */

public class MList {
     public static void main(String[] args){
         try {
             System.out.println("-----StackOfNumber S1-----");
             StackOfNumber S1 = new StackOfNumber();
             S1.add(16);
             S1.add(23);
             S1.add(56);
             S1.del();
             S1.add(99);
             S1.cetak();
             System.out.println("TOP Element : " + S1.getTop());
             
             System.out.println("-----StackOfPoints S2-----");
             StackOfPoints S2 = new StackOfPoints();
             S2.add(new Point(4,5));
             S2.add(new Point(9,7));
             S2.add(new Point(4,5));
             S2.del();
             S2.add(new Point(10,5));
             S2.cetak();
             System.out.print("TOP Element : "); S2.getTop().cetak();
             
             System.out.println("-----QueueOfNumber Q1-----");
             QueueOfNumber Q1 = new QueueOfNumber();
             Q1.add(12);
             Q1.add(23);
             Q1.add(56);
             Q1.del();
             Q1.add(99);
             Q1.cetak();
             System.out.println("HEAD Element : " + Q1.getHead());
             System.out.println("TAIL Element : " + Q1.getTail());
             
             System.out.println("-----QueueOfNumber Q2-----");
             QueueOfPoints Q2 = new QueueOfPoints();
             Q2.add(new Point(34,89));
             Q2.add(new Point(-76,90));
             Q2.add(new Point(0,0));
             Q2.del();
             Q2.add(new Point(-10,-10));
             Q2.cetak();
             System.out.println("HEAD Element : "); Q2.getHead().cetak();
             System.out.println("TAIL Element : "); Q2.getTail().cetak();
         } catch (Exception ex) {
             System.out.println(ex.getMessage());
         }
     }
}