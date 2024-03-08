/*
 * File      : BankAccount.java
 * Deskripsi : Class dengan atribut deposit, withdraw, dan getBalance 
 * Nama/NIM  : Yusuf Zaenul Mustofa/24060122120021
 * Tanggal   : 6 Maret 2024
 */
public class BankAccount {
    /*Atribut */
    private double balance;
    private final double MIN_BALANCE = 100.0;

    /*Method */
    /*Initiator */
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    /*Prosedur untuk menambahkan saldo ke rekening */
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    /*Prosedur untuk mengambil saldo dari rekening */
    public void withdraw(double amount) throws InsufficientFundsException{
        if (balance - amount < MIN_BALANCE){
            throw new InsufficientFundsException("Insufficient funds. Minimum balance required: $100.0");
        }
        balance -= amount;
        System.out.println("Withdrawn: $" + amount);
    }

    /*Fungsi selektor untuk mendapatkan nilai dari balance */
    public double getBalance(){
        return balance;
    }
}
