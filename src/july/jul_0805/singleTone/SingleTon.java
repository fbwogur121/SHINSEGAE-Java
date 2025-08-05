package july.jul_0805.singleTone;

public class SingleTon {
    // 싱글톤 클래스 객체를 담을 인스턴스 변수
    private static SingleTon instance;

    // 생성자를 private 선언 > 외부에서 인스턴스 생성 불가 (new 못하게)
    private SingleTon(){};

    public static SingleTon getInstance(){
        if(instance == null){
            instance = new SingleTon();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingleTon s1 = SingleTon.getInstance();
        SingleTon s2 = SingleTon.getInstance();
        SingleTon s3 = SingleTon.getInstance();

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
//        july.jul_0805.singleTone.SingleTone@1f32e575
//        july.jul_0805.singleTone.SingleTone@1f32e575
//        july.jul_0805.singleTone.SingleTone@1f32e575
        // >> 싱글톤 패턴은 객체 하나만 만들어서 재활용한다.

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
//        true
//        true
//        true
    }
}
