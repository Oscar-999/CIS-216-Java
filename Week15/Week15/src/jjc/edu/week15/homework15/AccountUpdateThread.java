package jjc.edu.week15.homework15;
//Oscar Alcantar
//Homework 15
//Description:In this project, you will add some code to a program that processes bank transactions. This
//program will use multithreading.

import java.util.Scanner;

public class AccountUpdateThread implements Runnable {

    //The bank account object to work with
    private final BankAccount account;

    //A number to indentify transactions to make the output easier to see
    private final int transId;

    //Constructor
    public AccountUpdateThread(BankAccount account, int transId) {
        this.account = account;
        this.transId = transId;
    }

    @Override
    public void run() {
    /*The run method (here) and the updateBalance method (in BankAccount)
        combine to perform the four tasks of the transaction:

        1. Display the transaction id and starting balance (here in run)

        2. Prompt the user for the amount of the withdrawal (here in run)
        3. Call the updateBalance() method of the BankAccount object, which
		   will perform the math to subtract the withdrawal from the balance.
        4. Display the updated balance (here in run)
    */

        //your code goes here - See the list above
        //1Prints
        System.out.println("Starting balance for transaction id " + transId + "= " + account.getBalance());
        //2
        System.out.println("Enter amount of withdrawal for transaction " + transId);

        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        //3
        account.updateBalance(transId, amount);
        //4
        System.out.println("Updated balance after transaction id " + transId + " = " + account.getBalance());
    }
}
