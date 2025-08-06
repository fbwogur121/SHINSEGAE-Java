package algorithm.jungol.문자열.문자열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 연습문제1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            char x = br.readLine().charAt(0);
            System.out.printf("%c -> %d\n", x, (int) x);
            if (x == '0') break;
        }
    }
}
