package algorithm.jungol.배열.배열2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 형성평가8 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void inputArray(int[][] arr) throws IOException{
        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                arr[i][2] += arr[i][j];
                arr[4][j] += arr[i][j];
                arr[4][2] += arr[i][j];
            }
        }
    }

    public static void printAvg(int[][] arr){
        for (int i = 0; i < 4; i++)
            System.out.print(arr[i][2]/2 + " ");
        System.out.println();
        for (int i = 0; i < 2; i++)
            System.out.print(arr[4][i]/4 + " ");
        System.out.println();
        System.out.print(arr[4][2]/8);
    }

    public static void main(String[] args) throws IOException {
        int[][] arr = new int[5][3];
        inputArray(arr);
        printAvg(arr);
    }
}
