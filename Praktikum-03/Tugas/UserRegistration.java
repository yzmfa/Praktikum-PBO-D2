/*
 * File      : UserRegistration.java
 * Deskripsi : Main dari class UserInputValidator yang merupakan implementasi assertion
 * Nama/NIM  : Yusuf Zaenul Mustofa/24060122120021
 * Tanggal   : 6 Maret 2024
 */
import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*Memasukkan username */
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        UserInputValidator.validateUsername(username);
    
        /*Memasukkan alamat email */
        System.out.print("Enter email address: ");
        String email = scanner.nextLine();
        UserInputValidator.validateEmail(email);
    
        /*Memasukkan umur */
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        UserInputValidator.validateAge(age);

        scanner.close();
    
        System.out.println("User registration successful!");
      }
    
}
