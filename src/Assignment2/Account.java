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
    public boolean credit(int amount){
        if (amount <= 0) return false;
            balance += amount;
            return true;
    }

    public boolean debit(int amount){
        if (amount <=0 || amount > balance) return false;
            balance -= amount;
            return true;
    }

    public boolean transferTo(Account account, int amount) {
        if (amount <=0 || amount > balance) return false;
        account.balance += amount;
        balance -= amount;
        return true;
    }
}
