package algorithm.jungol.문자열.문자열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연습문제3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = "jungol olympiad";
        for(int i = 0; i<5; i++){
            int x = Integer.parseInt(st.nextToken());
            System.out.print(str.charAt(x));
        }
    }
}
