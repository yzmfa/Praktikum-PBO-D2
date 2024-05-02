public class Polimorfisme {
    /* a. Polimorfisme Ad Hoc: Overloading
     *      Contoh dan Syarat Overloading
     *      class Calculator {
                int add(int a, int b) {
                    return a + b;
                }
                double add(double a, double b) {
                    return a + b;
                }
                int add(int a, int b, int c) {
                    return a + b + c;
                }
            }

            Dalam kelas Calculator di atas, ada tiga metode add dengan nama yang sama tetapi berbeda signaturenya:
            1. add(int a, int b): Metode ini menjumlahkan dua angka integer (a dan b).
            2. add(double a, double b): Metode ini menjumlahkan dua angka double (a dan b).
            3. add(int a, int b, int c): Metode ini menjumlahkan tiga angka integer (a, b, dan c).
            
            Syarat-syarat untuk method overloading:

            1. Nama Metode yang Sama: Semua metode harus memiliki nama yang sama.
            2. Signature Metode yang Berbeda: Metode harus memiliki parameter yang berbeda, baik dalam hal jenis, jumlah, atau urutan parameter.
            3. Return Type Tidak Mempengaruhi Overloading: Return type metode tidak mempengaruhi overloading. 
               Artinya, jika dua metode hanya berbeda pada return type tetapi memiliki parameter yang sama, itu tidak akan dianggap sebagai metode yang berbeda dalam hal overloading.
            4. Visibilitas Metode Tidak Mempengaruhi Overloading: Access modifier (seperti public, protected, atau private) dari metode tidak mempengaruhi apakah metode tersebut overloading atau tidak.
     * 
     * 
     * b. 
     *      1. output : 97      | Kode tersebut berhasil dieksekusi karena konversi tipe data dilakukan secara otomatis oleh compiler (Coercion), dan akan menghasilkan ASCII dari karakter 'a'
     *      2. output : error   | Kode tersebut gagal dieksekusi karena konversi tipe data double ke integer tidak dapat dilakukan
     *      3. output : 25.0    | Kode tersebut berhasil dieksekusi karena konversi tipe data dilakukan secara otomatis oleh compiler (Coercion)
     *      4. output : N       | Kode tersebut berhasil dieksekusi karena dilakukan casting secara eksplisit dari integer ke char, ASCII 78 adalah N
     *      5. output : 97.0    | Kode tersebut berhasil dieksekusi karena konversi tipe data dilakukan secara otomatis oleh compiler (Coercion), dan karakter 'a' akan diubah menjadi ASCII dalam format double
     */
}
