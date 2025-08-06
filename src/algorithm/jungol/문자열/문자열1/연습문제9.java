package algorithm.jungol.문자열.문자열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 연습문제9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputString = br.readLine();
        int lenOfStr = inputString.length();

        for (int i = 1; i <= lenOfStr; i++) {
            System.out.println(inputString.substring(i) + inputString.substring(0, i));
        }

    }
}
