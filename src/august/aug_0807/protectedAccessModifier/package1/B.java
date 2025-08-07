package august.aug_0807.protectedAccessModifier.package1;

public class B {
    //메소드 선언
    public void method(){
        A a = new A();
        a.field = "value";
        System.out.println("protected인 A와 같은 패키지에 있는 B에서 실행하는");
        a.method();
    }

    public static void main(String[] args) {
        B b = new B();
        b.method();
    }
}