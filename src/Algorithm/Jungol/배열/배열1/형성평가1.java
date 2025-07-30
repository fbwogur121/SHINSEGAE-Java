package Algorithm.Jungol.배열.배열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 형성평가1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Character[] arr = new Character[10];

        for(int i = 0; i<10; i++){
            arr[i] = st.nextToken().charAt(0);
        }
        for(int i = 9; i>=0; i--){
            System.out.print(arr[i]+ " ");
        }
    }
}
