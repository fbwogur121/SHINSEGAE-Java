package Algorithm.Jungol.배열.배열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 형성평가5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double sum = 0;
        for(int i = 0; i<6; i++){
            sum += Double.parseDouble(st.nextToken());
        }

        System.out.printf("%.1f", sum/6);

    }
}
