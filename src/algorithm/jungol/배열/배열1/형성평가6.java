package algorithm.jungol.배열.배열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 형성평가6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr =  {'J', 'U', 'N', 'G', 'O', 'L'};
        char x = br.readLine().charAt(0);

        for(int i = 0; i<6; i++){
            if(arr[i] == x)
            {
                System.out.print(i);
                break;
            }
            else if(i==5) System.out.print("none");
        }
    }
}
