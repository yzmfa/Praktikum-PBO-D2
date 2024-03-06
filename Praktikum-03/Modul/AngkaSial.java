/*
 * File      : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri dan pengenalan klausa 'throw' dan 'throws'
 * Nama/NIM  : Yusuf Zaenul Mustofa/24060122120021
 * Tanggal   : 6 Maret 2024
 */
public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }
        catch (AngkaSialException ase){
            //Method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

