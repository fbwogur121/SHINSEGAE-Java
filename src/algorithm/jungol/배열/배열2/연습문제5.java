package algorithm.jungol.배열.배열2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연습문제5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        int[][] res = new int[3][3];

        for (int i = 0; i < 3; i++) {
            System.out.printf("첫 번째 배열 %d행 ", i + 1);
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.printf("두 번째 배열 %d행 ", i + 1);
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                res[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

    }
}
