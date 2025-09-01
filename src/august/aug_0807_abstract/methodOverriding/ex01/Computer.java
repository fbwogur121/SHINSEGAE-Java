package august.aug_0807_abstract.methodOverriding.ex01;

public class Computer extends Calculator {

    public Computer() {
        super();
    }


    // Calculator(부모 클래스)의 areaCircle 메소드 오버라이딩
    @Override // 어노테이션(@) - 컴파일 시 정확히 오버라이딩이 되었는지 체크해 주는 기능. 생략해도 컴파일러가 붙혀 주지만 오버라이딩 했다는 것을 명시해 주는 것.
    public double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        //super.areaCircle(r);
        return Math.PI * r * r;
    }
}
