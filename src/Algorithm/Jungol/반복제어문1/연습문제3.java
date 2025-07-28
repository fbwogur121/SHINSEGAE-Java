package Algorithm.Jungol.반복제어문1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 연습문제3 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.print("점수를 입력하세요. ");
            int n = Integer.parseInt(br.readLine());
            if(n<0 || n>100) break;
            else if(n>=80) System.out.println("축하합니다. 합격입니다.");
            else System.out.println("죄송합니다. 불합격입니다.");

        }
    }
}
