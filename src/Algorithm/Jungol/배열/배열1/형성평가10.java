package Algorithm.Jungol.배열.배열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 형성평가10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            int x = Integer.parseInt(st.nextToken());
            arr[i] = x;
        }
        Arrays.sort(arr);
        for(int i = n-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}