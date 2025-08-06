package algorithm.jungol.연산자;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연습문제2 {
    public static void main(String[] args) throws Exception{
        System.out.print("5개의 수를 입력하시오. ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken()) + 3;
        int b = Integer.parseInt(st.nextToken()) - 3;
        int c = Integer.parseInt(st.nextToken()) * 3;
        int d = Integer.parseInt(st.nextToken()) / 3;
        int e = Integer.parseInt(st.nextToken()) % 3;
        System.out.printf("%d %d %d %d %d", a, b, c, d, e);
    }
}
