package algorithm.jungol.입력;

import java.util.Scanner;

public class 연습문제9 {
    public static void main(String[] args) {
        System.out.println("두 개의 실수를 입력하시오.");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.printf("x = %.2f\ny = %.2f",a,b);
    }
}
