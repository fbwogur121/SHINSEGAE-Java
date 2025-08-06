package algorithm.jungol.배열.배열1;

import java.io.IOException;
import java.util.Arrays;

public class 연습문제9 {
    public static void main(String[] args) throws IOException {
        int[] arr = {95, 75, 85, 100, 50};
        Arrays.sort(arr);
        for(int i = 0; i<5; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
