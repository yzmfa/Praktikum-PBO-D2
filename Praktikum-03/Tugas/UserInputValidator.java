/*
 * File      : UserInputValidator.java
 * Deskripsi : Class dengan atribut validateUsername, validateEmail, dan validateAge dengan assertion sesuai ketentuan yang ada
 * Nama/NIM  : Yusuf Zaenul Mustofa/24060122120021
 * Tanggal   : 6 Maret 2024
 */
public class UserInputValidator {
    public static void validateUsername(String username) {
        /*Memastikan bahwa panjang username minimal 5 charactere */
        assert username.length() >= 5 : "Usename must be at least 5 characters long";

        /*Memastikan bahwa panjang username maksimal 20 charactere */
        assert username.length() <= 20 : "Usename must be at most 20 characters long";

        /*Memastikan bahwa username harus diawali dengan huruf */
        assert Character.isLetter(username.charAt(0)): "Invalid username";

        /*Memastikan bahwa username hanya boleh berisi huruf, angka, dan underscore */
        assert username.matches("[a-zA-Z0-9_]+"): "Username can only contain letters, numbers, and underscores";
    }

    public static void validateEmail(String email){
        /*Memastikan bahwa email yang digunakan adalah email yang valid */
        assert email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}"): "Invalid email address";
    }

    public static void validateAge(int age){
        /*Memastikan bahwa umur berada dalam rentang 17-99 tahun */
        assert age >= 17 && age <= 99 : "Age must between 17 and 99";
    }
}
