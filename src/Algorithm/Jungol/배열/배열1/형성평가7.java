package Algorithm.Jungol.배열.배열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 형성평가7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        while(true){
            int x = Integer.parseInt(st.nextToken());

            if(x == 999) break;

            if(x>max) max=x;
            if(x<min) min=x;

        }
        System.out.printf("max : %d\nmin : %d",max, min);
    }
}