package algorithm.jungol.배열.배열2;

import java.util.Scanner;

public class 형성평가9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[][] arr = new int[x][x];
        arr[x-1][0] = 1;
        arr[x-2][0] = 1;
        arr[x-2][1] = 1;

        for (int i = x-3; i <= 0; i--) {
            arr[i][0] = 1;
            for (int j = 1; j < x-i; j++) {
                arr[i][j] = arr[i+1][j] + arr[i+1][j-1];
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if(arr[i][j]!=0){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
