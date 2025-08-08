package august.aug_0808.ex02;

public interface Service {
    // 1-1. 디폴트 메소드
    default void defaultMethod1(){
        System.out.println("default1()");
        defaultCommon();
    }
    default void defaultMethod2(){
        System.out.println("default2()");
        defaultCommon();
    }

    // 1-2. private 메소드
    private void defaultCommon(){
        System.out.println("defaultMethod의 중복코드 A");
        System.out.println("defaultMethod의 중복코드 B");
    }

    //////////////////////////////////////////////////////////

    // 2-1. static 메소드
    static void staticMethod1(){
        System.out.println("staticMethod()1");
        staticCommon();
    }
    static void staticMethod2(){
        System.out.println("staticMethod()2");
        staticCommon();
    }

    // 2-2. private static 메소드
    private static void staticCommon(){
        System.out.println("staticMethod의 중복코드 A");
        System.out.println("staticMethod의 중복코드 B");
    }
}
