package Assignment2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account[] accounts = new Account[50];
        accounts[0] = new Account ("123456789","Pham Duy Hung",5000000);
        accounts[1] = new Account ("987654321","Tran Van Thanh",10000000);
        accounts[0].hienThiAccount();
        accounts[1].hienThiAccount();

        Scanner sc = new Scanner(System.in);

    }
}
