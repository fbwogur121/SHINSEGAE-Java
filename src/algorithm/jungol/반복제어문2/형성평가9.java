package algorithm.jungol.반복제어문2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 형성평가9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st1.nextToken());

        for(int i = 1; i<=a; i++){
            for(int j = 1; j<=a; j++){
                System.out.printf("(%d, %d) ",i,j);
            }
            System.out.println();
        }

    }
}
