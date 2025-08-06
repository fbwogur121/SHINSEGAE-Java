package august.aug_0805_class.morningTest;

public class Account {
    private String accountNum;
    private String owner;
    private int balance;

    public Account(String accountNum, String owner, int balance) {
        this.accountNum = accountNum;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAccountNum() {
        return accountNum;
    }
    public String getOwner() {
        return owner;
    }
    public int getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) {
        balance -= money;
    }
}