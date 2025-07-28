package Algorithm.Jungol.반복제어문1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 연습문제4 {
    public static void main(String[] args) throws Exception{
        int n = 0;
        int sum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int t = Integer.parseInt(br.readLine());
            if(t==0) break;
            n++;
            sum += t;
        }
        System.out.printf("입력된 자료의 개수 = %d\n",n);
        System.out.printf("입력된 자료의 합계 = %d\n",sum);
        System.out.printf("입력된 자료의 평균 = %.2f\n", sum/n);
    }
}
