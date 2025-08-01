package Algorithm.Jungol.배열.배열2;

public class 연습문제4 {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 5, 4},
                {2, 6, 7},
                {8, 10, 1}
        };

        for(int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
