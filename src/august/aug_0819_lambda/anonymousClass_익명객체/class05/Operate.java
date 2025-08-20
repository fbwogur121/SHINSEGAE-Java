package august.aug_0819_lambda.anonymousClass_익명객체.class05;

public interface Operate {
    // 추상메서드
    int operate(int a, int b);

    // default 메서드
    default void print(){
        System.out.println("print");
    }
}
