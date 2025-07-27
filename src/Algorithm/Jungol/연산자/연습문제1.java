package Algorithm.Jungol.연산자;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class 연습문제1 {
    public static void main(String[] args) throws Exception{
        System.out.print("두 개의 수를 입력하시오. ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a  = Integer.parseInt(st.nextToken());
        int b  = Integer.parseInt(st.nextToken());

        System.out.printf("%d + %d = %d\n", a, b, a+b);
        System.out.printf("%d - %d = %d\n", a, b, a-b);
        System.out.printf("%d * %d = %d\n", a, b, a*b);
        System.out.printf("%d / %d = %d\n", a, b, a/b);
        System.out.printf("%d %% %d = %d\n", a, b, a%b);
    }
}
