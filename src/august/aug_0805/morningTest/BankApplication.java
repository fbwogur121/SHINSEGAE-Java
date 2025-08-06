package august.aug_0805.morningTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankApplication {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Account[] accounts = new Account[100];
    static int count = 0;

    public static void main(String[] args) throws IOException {
        while (true) {
            info();
            String choice = br.readLine();
            switch (choice) {
                case "1" -> createAccount();
                case "2" -> accountList();
                case "3" -> deposit();
                case "4" -> withdraw();
                case "5" -> {
                    System.out.println("프로그램 종료");
                    return;
                }
                default -> System.out.println("1~5 중 선택해 주세요.");
            }
        }
    }

    // 1. 계좌생성
    public static void createAccount() throws IOException {
        System.out.println("-------");
        System.out.println("계좌생성");
        System.out.println("-------");

        System.out.print("계좌번호: ");
        String accountNum = br.readLine();

        System.out.print("계좌주: ");
        String name = br.readLine();

        System.out.print("초기입금액: ");
        int balance = Integer.parseInt(br.readLine());

        accounts[count++] = new Account(accountNum, name, balance);
        System.out.println("결과: 계좌가 생성되었습니다.");
    }

    // 2. 계좌목록
    public static void accountList() {
        System.out.println("-------");
        System.out.println("계좌목록");
        System.out.println("-------");

        for (int i = 0; i < count; i++) {
            Account a = accounts[i];
            System.out.println(a.getAccountNum() + "\t" + a.getOwner() + "\t" + a.getBalance());
        }
        System.out.println();
    }

    // 3. 예금
    static void deposit() throws IOException {
        System.out.println("-------");
        System.out.println("예금");
        System.out.println("-------");
        System.out.print("계좌번호: ");
        String accNum = br.readLine();
        Account a = findAccount(accNum);
        if (a == null) {
            System.out.println("해당 계좌가 없습니다.\n");
            return;
        }
        System.out.print("입금액: ");
        int money = Integer.parseInt(br.readLine());
        a.deposit(money);
    }

    // 4. 출금
    static void withdraw() throws IOException {
        System.out.println("-------");
        System.out.println("출금");
        System.out.println("-------");
        System.out.print("계좌번호: ");
        String accNum = br.readLine();
        Account a = findAccount(accNum);
        if (a == null) {
            System.out.println("해당 계좌가 없습니다.");
            return;
        }
        System.out.print("출금액: ");
        int money = Integer.parseInt(br.readLine());
        if (money > a.getBalance()) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        a.withdraw(money);
    }

    public static void info() {
        System.out.println("-------------------------------------------");
        System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
        System.out.println("-------------------------------------------");
        System.out.print("선택> ");
    }

    static Account findAccount(String accNum) {
        for (int i = 0; i < count; i++)
            if (accounts[i].getAccountNum().equals(accNum))
                return accounts[i];
        return null;
    }
}
