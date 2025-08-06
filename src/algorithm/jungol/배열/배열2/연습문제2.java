package algorithm.jungol.배열.배열2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연습문제2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[10];

        while(true){
            int x = Integer.parseInt(st.nextToken());

            if(x==0) break;

            arr[x%10] ++;

        }
        for(int i =0; i<10; i++){
            if(arr[i] != 0)
                System.out.printf("%d : %d개\n", i, arr[i]);
        }

    }
}
