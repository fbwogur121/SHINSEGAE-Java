package Algorithm.Jungol.연산자;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 자가진단6 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.printf("%d > %d --- %d\n", a, b, a > b ? 1 : 0);
        System.out.printf("%d < %d --- %d\n", a, b, a < b ? 1 : 0);
        System.out.printf("%d >= %d --- %d\n", a, b, a >= b ? 1 : 0);
        System.out.printf("%d <= %d --- %d\n", a, b, a <= b ? 1 : 0);
    }
}
