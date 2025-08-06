package algorithm.jungol.반복제어문2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 형성평가10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st1.nextToken());
        int b = Integer.parseInt(st1.nextToken());

        if(a>b){
            for(int i = 1; i<=9; i++){
                for(int j = a; j>=b; j--){
                    System.out.printf("%d * %d = %2d   ", j, i, j*i);
                }
                System.out.println();
            }
        }
        else{
            for(int i = 1; i<=9; i++){
                for(int j = a; j<=b; j++){
                    System.out.printf("%d * %d = %2d   ", j, i, j*i);
                }
                System.out.println();
            }
        }


    }
}
