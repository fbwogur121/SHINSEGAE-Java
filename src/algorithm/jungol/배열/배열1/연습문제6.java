package algorithm.jungol.배열.배열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연습문제6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[10];
        int max = 0;
        for(int i = 0; i<10; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(max<arr[i]) max=arr[i];
        }
        System.out.print(max);
    }
}
