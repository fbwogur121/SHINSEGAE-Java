package algorithm.jungol.배열.배열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 형성평가4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[100];

        for (int i = 0; i < 100; i++) {
            int x = Integer.parseInt(st.nextToken());
            if (x == -1) break;
            arr[i] = x;
        }

        int len = 0;
        for (int i = 0; i < 100; i++) {
            if (arr[i] != 0) len++;
        }
        if (len < 3) {
            for (int i = 0; i < len; i++) {
                System.out.printf(arr[i] + " ");
            }
        } else {
            for (int i = len - 3; i < len; i++) {
                System.out.printf(arr[i] + " ");
            }
        }
    }
}
