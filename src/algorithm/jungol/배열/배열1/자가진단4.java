package algorithm.jungol.배열.배열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 자가진단4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[100];

        for(int i = 0; i<100; i++){
            int x = Integer.parseInt(st.nextToken());
            if(x==0) break;
            arr[i] = x;
        }

        for(int j = 0; j<arr.length; j++){
            if(arr[arr.length-1-j] != 0)
                System.out.print(arr[arr.length-1-j] +" ");
        }
    }
}
