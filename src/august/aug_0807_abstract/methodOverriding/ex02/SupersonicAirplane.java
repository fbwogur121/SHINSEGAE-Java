package august.aug_0807_abstract.methodOverriding.ex02;

public class SupersonicAirplane extends Airplane {
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;
    public int flyMode = NORMAL;

    // 메소드 재정의


    @Override
    public void fly() {
        if (flyMode == SUPERSONIC) {
            System.out.println("SUPERSONIC 모드로 비행합니다.");
        } else {
            super.fly();
        }
    }
}
