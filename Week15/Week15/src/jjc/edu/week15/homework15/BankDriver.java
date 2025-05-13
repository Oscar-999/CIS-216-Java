package jjc.edu.week15.homework15;

//Oscar Alcantar
//Homework 15
//Description:In this project, you will add some code to a program that processes bank transactions. This
//program will use multithreading.
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BankDriver {
    public static void main(String[] args) {

        //Creates a bank account with a starting balance of 100
        BankAccount account = new BankAccount(100);

        //Creates two threads to handle two transactions
        //The number is the transaction ID.
        AccountUpdateThread accountUpdateThread1 = new AccountUpdateThread(account,1);
        AccountUpdateThread accountUpdateThread2 = new AccountUpdateThread(account,2);

        //Creates a thread pool
        ExecutorService executorService = Executors.newCachedThreadPool();

        //Begins executing each thread
        executorService.execute(accountUpdateThread1);
        executorService.execute(accountUpdateThread2);

        //Deletes all threads
        executorService.shutdown();
    }
}
