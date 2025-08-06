package algorithm.jungol.연산자;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 자가진단5 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        if(a == b) System.out.print("1\n");
        else System.out.printf("0\n");

        if(a == b) System.out.print("0\n");
        else System.out.printf("1\n");
    }
}
