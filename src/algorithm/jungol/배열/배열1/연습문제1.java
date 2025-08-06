package algorithm.jungol.배열.배열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연습문제1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[5];

        for(int i = 0; i<5; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i<5; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
