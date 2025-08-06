package algorithm.jungol.배열.배열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 행복 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for(int i = 0; i<n; i++){
            int x = Integer.parseInt(st.nextToken());
            if(x>max) max = x;
            if(x<min) min = x;
        }
        System.out.print(max-min);
    }
}
