package algorithm.jungol.배열.배열2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 형성평가1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[7];
        for(int i = 0; i<10; i++){
            int x = Integer.parseInt(st.nextToken());
            arr[x] ++;
        }
        for(int i=1; i<7; i++){
            System.out.printf("%d : %d\n",i, arr[i]);
        }
    }
}
