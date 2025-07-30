package Algorithm.Jungol.배열.배열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연습문제8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[10];
        int sum = 0;
        double avg = 0;

        for(int i = 0; i<10; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
        }
        avg = sum/10;
        System.out.printf("총점 = %d\n평균 = %.1f", sum, avg);
    }
}
