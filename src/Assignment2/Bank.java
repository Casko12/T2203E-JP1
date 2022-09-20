package Assignment2;

public class Bank {
    public Bank() {

    }
    public String id;
    public String name;
    public int balance;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Bank(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public void credit(int c){
        if (c <= 0) {
            System.out.println("Số tiền nạp vào tài khoản phải lớn hơn 0");
        }else
            balance = balance + c;
    }

    public void debit(int d){
        if (d <= balance){
            balance = balance - d;
            System.out.println(getBalance());

        }else
            System.out.println("Tài khoản không đủ tiền!");
    }
}
