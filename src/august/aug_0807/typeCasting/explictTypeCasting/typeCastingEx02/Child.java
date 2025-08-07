package august.aug_0807.typeCasting.explictTypeCasting.typeCastingEx02;


public class Child extends Parent {
    public String childName = "이마트";

    //메소드 오버라이딩
    @Override
    public void method1() {
        System.out.println(this.name);
        System.out.println(this.childName);
        super.method1();
        System.out.println("나는 부모에게 상속받아 overrive한 자식의 method1()");
    }

    @Override
    public void method2() {
        System.out.println("나는 부모에게 상속받아 overrive한 자식의 method2()");
    }

    public void method3() {
        System.out.println("나는 자식의 method3()");
    }


    //메소드 선언

}