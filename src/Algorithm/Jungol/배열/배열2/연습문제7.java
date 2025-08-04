package Algorithm.Jungol.배열.배열2;

public class 연습문제7 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        arr[0][0] = 1;
        arr[1][0] = 1;
        arr[2][0] = 1;
        arr[3][0] = 1;
        arr[4][0] = 1;
        for(int i = 1; i<5; i++){
            for(int j=1; j<=i; j++){
                arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
            }
        }
        for(int i = 0; i<5; i++){
            for(int j=0; j<5; j++){
                if(arr[i][j] != 0) System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
