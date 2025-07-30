package Algorithm.Jungol.배열.배열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연습문제7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int oddMin = 0, evenMax = 0;

        for(int i = 0; i<10; i++){
            int x = Integer.parseInt(st.nextToken());
            if(x%2 == 0 && x>evenMax){
                evenMax = x;
            }else if(x<oddMin){
                oddMin = x;
            }
        }
        System.out.printf("%d %d", oddMin, evenMax);
    }
}
