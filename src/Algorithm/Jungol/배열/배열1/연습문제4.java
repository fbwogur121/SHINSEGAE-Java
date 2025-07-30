package Algorithm.Jungol.배열.배열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연습문제4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[100];

        for(int i = 0; i<100; i++){
            int x = Integer.parseInt(st.nextToken());
            if(x==0) break;
            arr[i] = x;
        }

        for(int j = 1; j<51; j++){
            if(arr[2*j - 1] != 0)
                System.out.print(arr[2*j - 1]+" ");
        }
    }
}
