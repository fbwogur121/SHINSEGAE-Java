package august.aug_0807_abstract.typeCasting.explictTypeCasting.typeCastingEx02;

public class ChildExample {
    public static void main(String[] args) {
        //자식 객체 생성
        Child child = new Child();
        child.method1();
        System.out.println();

        //자동 타입 변환
        Parent parent = child;

        //메소드 호출
        parent.method1();
        parent.method2();
        //parent.method3(); - 불가
        System.out.println();

        //강제 타입 변환
        Child child1 = (Child) parent;
        child1.method1();
        child1.method3();
        System.out.println();

        ///////////////////////

        // 부모 타입으로 자식객체 생성
        Parent parent1 = new Child();
        // 부모타입으로 필드와 메소드 사용
        parent1.name = "newName";
        parent1.method1();
        parent1.method2();

    }
}