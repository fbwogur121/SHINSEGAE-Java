package algorithm.jungol.반복제어문2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 형성평가5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int even = 0;
        int odd = 0;
        for (int i = 0; i < 10; i++) {
            int a = Integer.parseInt(st1.nextToken());
            if (a % 2 == 0) even += 1;
            else odd += 1;
        }
        System.out.printf("even : %d\nodd : %d", even, odd);
    }
}
