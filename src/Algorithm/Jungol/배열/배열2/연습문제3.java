package Algorithm.Jungol.배열.배열2;

public class 연습문제3 {
    public static void main(String[] args) {
        int[] arr = new int[40];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < 40; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
            if (i % 10 == 9) {
                System.out.printf("피보나치 수열 %d항 : %d\n", i + 1, arr[i]);
            }
        }
    }
}
