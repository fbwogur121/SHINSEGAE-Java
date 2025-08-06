package algorithm.jungol.배열.배열2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연습문제1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[11];

        while(true){
            int x = Integer.parseInt(st.nextToken());
            if(x<1 || x>10) break;
            else{
                arr[x]++;
            }
        }
        for(int i = 0; i<=10; i++){
            if(arr[i] != 0){
                System.out.printf("%d : %d개\n", i, arr[i]);
            }
        }
    }
}
