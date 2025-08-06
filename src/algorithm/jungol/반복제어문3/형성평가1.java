package algorithm.jungol.반복제어문3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 형성평가1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0;
        int num = 0;

        for(int i = 0; i<20; i++){
            int a = Integer.parseInt(st.nextToken());
            if(a == 0) break;
            sum += a;
            num ++;
        }
        System.out.printf("%d %d", sum, sum/num);
    }
}
