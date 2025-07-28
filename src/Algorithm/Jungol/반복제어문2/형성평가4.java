package Algorithm.Jungol.반복제어문2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 형성평가4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st1.nextToken());

        int sum = 0;
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i<a; i++){
            sum += Integer.parseInt(st2.nextToken());
        }
        double avg = (double)sum/a;
        System.out.printf("%.2f", avg);
    }
}
