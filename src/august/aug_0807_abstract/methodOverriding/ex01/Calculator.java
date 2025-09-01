package august.aug_0807_abstract.methodOverriding.ex01;

public class Calculator {

    public Calculator() {

    }


    //메소드 선언
    public double areaCircle(double r) {
        System.out.println("Calculator 객체의 areaCircle() 실행");
        return 3.14159 * r * r;
    }
}
