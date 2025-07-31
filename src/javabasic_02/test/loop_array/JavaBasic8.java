package javabasic_02.test.loop_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaBasic8 {
    static int myMoney;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try{
                information();
                int n = Integer.parseInt(br.readLine());

                validateMenu(n);

                switch (n) {
                    case 1 -> firstFunction(br);
                    case 2 -> secondFunction(br);
                    case 3 -> thirdFunction();
                    case 4 -> {
                        System.out.print("프로그램 종료");
                        return;
                    }
                }
            }
            catch (InvalidMenuException e){
                System.out.println(e.getMessage() + "\n");
            }
        }
    }
    public static void validateMenu(int menu) throws InvalidMenuException {
        if (menu < 1 || menu > 4) {
            throw new InvalidMenuException("잘못된 입력입니다. 1번~4번 중 골라주세요.");
        }
    }

    public static void information() {
        System.out.println("-----------------------------");
        System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
        System.out.println("-----------------------------");
        System.out.print("선택> ");
    }

    public static void firstFunction(BufferedReader br) throws IOException {
        System.out.print("예금액> ");
        int n = Integer.parseInt(br.readLine());
        myMoney += n;
        System.out.println();
    }

    public static void secondFunction(BufferedReader br) throws IOException {
        System.out.print("출금액> ");
        int n = Integer.parseInt(br.readLine());
        if (n > myMoney) {
            System.out.printf("잔액이 부족합니다. 현재 잔액은 %d원 입니다.\n", myMoney);
        } else {
            myMoney -= n;
        }
        System.out.println();
    }

    public static void thirdFunction() {
        System.out.printf("잔고> %d\n\n", myMoney);
    }
}
