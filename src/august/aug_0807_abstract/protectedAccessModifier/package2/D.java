package august.aug_0807_abstract.protectedAccessModifier.package2;

import august.aug_0807_abstract.protectedAccessModifier.package1.A;

public class D  extends A {
    //생성자 선언
    public D(){
        super(); //extends A의 기본 생성자를 호출

    }

    //메소드 선언
    public void method1(){
        this.field = "value";
        this.method(); // 부모클래스 A의 메소드
    }

    //메소드 선언
    public void method2(){ // A를 상속받았더라도 protected이기 때문에 다른 패키지에서는 객체 생성 안됨.
//        A a = new A();
//        a.field = "value";
//        a.method;
    }

}