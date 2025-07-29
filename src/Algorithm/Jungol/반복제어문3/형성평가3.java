package Algorithm.Jungol.반복제어문3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 형성평가3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        for(int i = 1; i<=a; i++){
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
            if(i == a){
                for(int k=a-1; k>=1; k--){
                    for(int j = 1; j<=k; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }

    }
}
