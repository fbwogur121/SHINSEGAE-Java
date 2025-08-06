package algorithm.jungol.반복제어문2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 형성평가6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st1.nextToken());
        int b = Integer.parseInt(st1.nextToken());

        int start = a<b ? a:b;
        int end = a<b ? b:a;

        double sum = 0;
        int num = 0;
        for(int i = start; i<=end; i++){
            if(i%3==0 || i%5==0) {
                sum +=i;
                num += 1;
            }
        }
        System.out.printf("sum : %d\navg : %.1f",(int)sum, sum/num);

    }
}
