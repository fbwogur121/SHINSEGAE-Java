package algorithm.jungol.문자열.문자열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 연습문제6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = br.readLine();

            // 입력이 null이거나 비어있는 경우 무시
            if (line == null || line.isEmpty()) continue;

            char ch = line.charAt(0);

            if (Character.isLowerCase(ch)) {
                System.out.println("소문자입니다.");
            } else if (Character.isUpperCase(ch)) {
                System.out.println("대문자입니다.");
            } else if (Character.isDigit(ch)) {
                System.out.println("숫자문자입니다.");
            } else {
                System.out.println("영문, 숫자 이외의 문자입니다.");
                break;
            }
        }
    }
}
