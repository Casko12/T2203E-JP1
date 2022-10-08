package Exam.Bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input balance (USD): ");
        Bank b1 = new Bank();
        b1.setBalance(sc.nextInt());
        System.out.println("Please input interest rate (%): ");
        b1.setRate(sc.nextInt());
        b1.calculateInterest();
        System.out.println("Interest is: "+ b1.calculateInterest()+" USD");
    }
}
