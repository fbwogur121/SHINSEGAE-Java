package Algorithm.Jungol.배열.배열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 형성평가9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = 0;
        int[] arr = new int[100];

        for(int i = 0; i<100; i++){
            int x = Integer.parseInt(st.nextToken());
            if(x==0)break;
            num++;
            arr[i] = x;
        }
        System.out.println(num);
        for(int i = 0; i<num; i++){
            if(arr[i]%2==0){
                System.out.printf("%d ", arr[i]/2);
            }else{

                System.out.printf("%d ", arr[i]*2);
            }
        }
    }
}
