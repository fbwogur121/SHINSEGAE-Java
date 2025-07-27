package Algorithm.Jungol.반복제어문;

public class 연습문제2 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        while (num < 11) {
            sum += num;
            num++;
        }
        System.out.printf("1부터 10까지의 합 = %d\n", sum);
        System.out.printf("while문이 끝난 후의 num의 값 = %d", num);
    }
}
