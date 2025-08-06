package august.aug_0806_inheritance.classTest.test03.test03_2;

public class Account {
    private String accNo;
    private int balance;

    public void save(int money){
        System.out.println(getAccNo()+" 계좌에 "+money+"만원이 입금되었습니다.");
        this.balance += money;
    }
    public void deposit(int money){
        System.out.println(getAccNo()+" 계좌에 "+money+"만원이 출금되었습니다.");
        this.balance -= money;
    }


    public void setAccNo(String accNo){
        this.accNo = accNo;
        System.out.println(getAccNo()+" 계좌가 개설되었습니다.");
    }
    public String getAccNo(){
        return this.accNo = accNo;
    }

    public int getBalance(){
        return this.balance = balance;
    }
}
