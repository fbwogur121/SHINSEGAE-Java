package august.aug_0819_lambda.anonymousClass_익명객체.class05;

// class04의 Main을 람다식으로 작성
public class Main {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 30;

        Calculator calculator = new Calculator(num1, num2);

        Operate operate = (n1, n2) -> n1 + n2;

        int result = calculator.calculate(operate);

        System.out.println(result);
    }
}
