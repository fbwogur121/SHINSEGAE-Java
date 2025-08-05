package july.jul_0804;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Calculator {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void info() {
        System.out.println("======================================");
        System.out.println("              사칙연산 계산기             ");
        System.out.println("======================================");
        System.out.println("1.덧셈 2.뺄셈 3.곱셈 4.나눗셈 5.프로그램 종료");
        System.out.println("두 수를 차례로 입력하고 수행할 사칙연산의 메뉴 숫자를 입력해 주세요.");
    }

    public static void adder(int x, int y) {
        result(x, y, '+', x + y);
    }

    public static void minus(int x, int y) {
        result(x, y, '-', x - y);
    }

    public static void multi(int x, int y) {
        result(x, y, 'x', x * y);
    }

    public static void divide(int x, int y) {
        double dx = (double) x;
        double dy = (double) y;
        System.out.println("결과는");
        System.out.printf("%d %% %d = %.1f\n", x, y, dx / dy);
    }

    public static void result(int x, int y, char t, int res) {
        System.out.println("결과는");
        System.out.printf("%d %c %d = %d\n", x, t, y, res);
    }

    public static void res(int x, int y, int menu) {
        switch (menu) {
            case 1 -> adder(x, y);
            case 2 -> minus(x, y);
            case 3 -> multi(x, y);
            case 4 -> divide(x, y);
            default -> System.out.println("1~5번의 메뉴 중 선택하세요.");
        }
    }

    public static void main(String[] args) throws IOException {
        while (true) {
            info();
            String input = br.readLine().trim();
            if (input.equals("5")) {
                System.out.println("프로그램 종료");
                break;
            }
            StringTokenizer st = new StringTokenizer(input);
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int menu = Integer.parseInt(st.nextToken());
            res(x, y, menu);
        }
    }
}
