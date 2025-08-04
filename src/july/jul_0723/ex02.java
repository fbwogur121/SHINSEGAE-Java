package july.jul_0723;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        //3개의 정수를 입력받고 더하여 결과를 출력하시오.
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.println("숫자 입력: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        int sum = a+b+c;

        System.out.printf("res: %d", a+b+c);
        System.out.println();
        System.out.println();  // cmd + d -> copy line
        System.out.println("res: " + sum);
    }
}
