package algorithm.jungol.배열.배열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 형성평가3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int oddSum = 0, evenSum = 0;

        for(int i = 0; i<10; i++){
            int x = Integer.parseInt(st.nextToken());
            if(i%2==0) oddSum += x;
            else evenSum += x;
        }
        System.out.printf("odd : %d\neven : %d",oddSum,evenSum);
    }
}
