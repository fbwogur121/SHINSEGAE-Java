package algorithm.jungol.문자열.문자열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 연습문제4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.printf("입력받은 문자열의 길이는 %d입니다.\n", str.length());
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

    }
}
