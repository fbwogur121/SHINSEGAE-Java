package august.aug_0807.protectedAccessModifier.package1;

public class A extends B {
    //필드 선언
    public String field;

    //생성자 선언
    protected A(){

    }

    //메소드 선언
    public void method(){
        System.out.println("protected인 A의 메소드.");
    }

}