package algorithm.jungol.배열.배열2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 형성평가7 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void inputArray(int[][] arr) throws IOException {
        for (int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }
    public static void multiArray(int[][] arr1, int[][] arr2)throws IOException{
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr1[i][j] *= arr2[i][j];
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[2][3];

        System.out.println("first array");
        inputArray(arr1);
        System.out.println("second array");
        inputArray(arr2);
        multiArray(arr1, arr2);
    }
}
