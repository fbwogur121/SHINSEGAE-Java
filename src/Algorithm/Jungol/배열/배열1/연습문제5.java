package Algorithm.Jungol.배열.배열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연습문제5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("YEAR = ");
            int year = Integer.parseInt(br.readLine());

            System.out.print("MONTH = ");
            int month = Integer.parseInt(br.readLine());

            if (year == 0 && month == 0) break;

            if (month < 1 || month > 12) {
                System.out.println("잘못 입력하였습니다.\n");
                continue;
            }

            int[] daysInMonth = {31, -1, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            // 윤년 여부 판단
            boolean isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);

            if (month == 2) {
                System.out.printf("입력하신 달의 날 수는 %d일입니다.\n\n", isLeap ? 29 : 28);
            } else {
                System.out.printf("입력하신 달의 날 수는 %d일입니다.\n\n", daysInMonth[month - 1]);
            }
        }
    }
}
