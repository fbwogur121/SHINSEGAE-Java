package algorithm.jungol.반복제어문3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 형성평가2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= 100; i++) {
            if ((a * i >= 100)) break;
            System.out.print(a * i + " ");
            if ((a * i % 10 == 0)) break;
        }
    }
}
