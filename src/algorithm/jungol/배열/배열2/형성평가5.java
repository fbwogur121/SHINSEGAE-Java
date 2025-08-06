package algorithm.jungol.배열.배열2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 형성평가5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[4][4];

        for (int i = 0; i < 4; i++) {
            System.out.printf("%dclass? ",i+1);
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            for (int j = 0; j <3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                sum += arr[i][j];
            }
            arr[i][3] = sum;
        }
        for (int i = 0; i < 4; i++) {
            System.out.printf("%dclass : %d\n",i+1, arr[i][3]);
        }
    }
}
