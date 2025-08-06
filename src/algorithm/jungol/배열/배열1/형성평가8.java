package algorithm.jungol.배열.배열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 형성평가8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int mul5 = 0;
        int sum = 0;

        for(int i = 0; i<100; i++){
            int x = Integer.parseInt(st.nextToken());

            if(x ==0 )break;
            if(x%5==0){
                mul5++;
                sum += x;
            }
        }
        double avg = sum/(double)mul5;
        System.out.printf("Multiples of 5 : %d\nsum : %d\navg : %.1f",mul5, sum, avg);
    }

}
