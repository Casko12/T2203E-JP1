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
        System.out.println(getId()+getName()+getBalance());
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

//    public Account transfer (Account f) {
//        if (transferAmount <= 0) {
//            System.out.println("Số tiền cần chuyển phải lớn hơn 0!");
//        }
//        if (transferAmount > this.balance) {
//            System.out.println("Số tiền cần chuyển lớn hơn số dư trong tài khoản!");
//        }else{
//
//        }
//    }
}
