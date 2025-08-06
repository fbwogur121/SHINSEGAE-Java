package algorithm.jungol.문자열.문자열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Character.*;

public class 연습문제7 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String tmpStr = br.readLine();
        int lenOfStr = tmpStr.length();

        for(int i=0; i<lenOfStr; i++){
            System.out.print(isUpperCase(tmpStr.charAt(i)) ? toLowerCase(tmpStr.charAt(i)):toUpperCase(tmpStr.charAt(i)));
        }
    }
}
