package algorithm.jungol.연산자;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연습문제6 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a > b) System.out.print("1 ");
        else System.out.print("0 ");
        if (b >= c) System.out.print("1 ");
        else System.out.print("0 ");
        if (a <= b) System.out.print("1 ");
        else System.out.print("0 ");
        if (b < c) System.out.print("1 ");
        else System.out.print("0 ");
    }
}
