package Algorithm.Jungol.배열.배열2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 형성평가2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[11];
        while(true){
            int x = Integer.parseInt(st.nextToken());
            if(x==0) break;
            arr[x/10] ++;
        }
        for(int i=10; i>=0; i--){
            if(arr[i] != 0) System.out.printf("%d : %d person\n",i*10, arr[i]);
        }
    }
}
// 100 90 8 7 6 5 4 3 2 1 0