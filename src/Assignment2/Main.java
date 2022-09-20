package Assignment2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account("123456789","Pham Duy Hung",5000000);
        Account myAccount2 = new Account ("987654321","Tran Van Thanh",10000000);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien muon rut:");
        int x = sc.nextInt();
        System.out.println("Nhap so tien muon chuyen:");
        int y = sc.nextInt();
        if(myAccount.debit(x)){
            System.out.println("Rut thanh cong "+x);
        }else{
            System.out.println("So du tai khoan khong du hoac nhap sai so tien");
        }
        if(myAccount.transferTo(myAccount2, y)){
            System.out.println("Chuyen thanh cong sang tai khoan "+myAccount2.getName());
        }else{
            System.out.println("Chuyen khoan that bai");
        }
    }
}
