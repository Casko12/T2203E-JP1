package Assignment2;

public class Account {
    public Account() {

    }
    public String id;
    public String name;
    public int balance;
    public int transferAmount;

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

    public int getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(int transferAmount) {
        this.transferAmount = transferAmount;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void hienThiAccount(){
        System.out.println(getId() + getName() + getBalance());
    }
    public void credit(int amount){
        if (amount <= 0) return;
            balance += amount;
    }

    public void debit(int amount){
        if (amount <=0 || amount > balance) return;
            balance -= amount;
    }

    public void transferTo(Account account, int amount) {
        if (amount <=0 || amount > balance) return;
        account.balance += amount;
        balance -= amount;
    }
}
