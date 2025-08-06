package algorithm.jungol.배열.배열2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연습문제6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[4][4];

        for(int i=0; i<3; i++){
            System.out.printf("%d번째 학생의 점수 ", i+1);
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j<3; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                arr[3][j] += arr[i][j];
                arr[i][3] += arr[i][j];
            }
        }
        arr[3][3] = arr[0][3]+arr[1][3]+arr[2][3];
        System.out.println("     국어 영어 수학 총점");
        for(int i = 0; i<4; i++){
            if(i<3) System.out.printf(" %d번",i+1);
            else System.out.print("합계");
            for(int j = 0; j<4; j++){
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
