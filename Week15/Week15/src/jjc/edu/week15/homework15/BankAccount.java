package jjc.edu.week15.homework15;

import java.util.Scanner;

public class BankAccount {

    private int balance;

    //Constructor
    public BankAccount(int balance) {
        this.balance = balance;
    }

    //Retrieves current balance
    public int getBalance() {
        return balance;
    }

    //See the comment for the run method in the AccountUpdateThread class
    public synchronized void updateBalance(int transId, int amt) {

        this.balance -= amt;
    }

}