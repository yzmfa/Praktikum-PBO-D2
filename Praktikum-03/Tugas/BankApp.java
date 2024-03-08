/*
 * File      : BankApp.java
 * Deskripsi : Main dari class BankAccount dan InsufficientFundsException
 * Nama/NIM  : Yusuf Zaenul Mustofa/24060122120021
 * Tanggal   : 6 Maret 2024
 */
public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.0);
        /*Skenario saldo mencukupi */
        try {
            account.withdraw(200.0);
            System.out.println("Saldo saat ini: $" + account.getBalance());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        /*Skenario saldo tidak mencukupi */
        try {
            account.withdraw(400.0);
            System.out.println("Saldo saat ini: $" + account.getBalance());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
