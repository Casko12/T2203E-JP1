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
}
