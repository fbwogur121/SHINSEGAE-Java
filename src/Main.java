public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int sum = 0;
        int sum1 = 0;

        sum = a+b+c+d+e;
        System.out.println(sum);

        System.out.println("==============");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
            sum1 += i;

            System.out.println(sum1);
        }
    }
}