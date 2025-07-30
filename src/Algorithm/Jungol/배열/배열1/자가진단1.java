package Algorithm.Jungol.배열.배열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 자가진단1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        char[] arr = new char[10];

        for(int i = 0; i<10; i++){
            arr[i] = st.nextToken().charAt(0);
        }
        for(char c: arr){
            System.out.print(c);
        }
    }
}
