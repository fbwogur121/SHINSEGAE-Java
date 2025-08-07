package august.aug_0807.typeCasting.automaticTypeCasting.ex01;

class A {}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

/*
   클래스 상속 관계
       (A)
      /   \
    (B)   (C)
     |     |
    (D)   (E)

 */

public class PromotionExample {

    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b; //상속관계이므로 b 객체변수에 저장된 주소값은 부모인 A타입의 a1에 담을 수 있다.
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1 = d;
        C c1 = e;
        // C c2 = d; 상속관계가 아니므로 자동변환 일어나지 않는다. 불가.
    }
}
