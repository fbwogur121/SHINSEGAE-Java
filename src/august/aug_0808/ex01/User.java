package august.aug_0808.ex01;

public class User {
    public static void main(String[] args) {
        RemoteControl rc = null;
        rc = new Television();

        //추상메소드
        rc.turnOn();
        rc.setVolume(10);
        rc.setVolume(11);
        rc.turnOff();

        //디폴트메소드
        rc.setMute(true);
        rc.setMute(false);

        //정적메소드
        RemoteControl.changeBattery();


        System.out.println("==============");
        // 리모컨을 통해 청소기를 동작. rc를 이용
        // 1. 청소기 전원 On
        // 2. 10분 청소
        // 3. 청소기 전원 OFf
        rc = new vacuumCleaner(10);
        rc.turnOn();
        rc.turnOff();


        // TV외 최대 볼륨 확인 - public static final은 타입.상수명 으로 접근해야 함! rc.상수명 안됨.
        System.out.println(RemoteControl.MAX_VOLUME);
        // TV외 최소 볼륨 확인
        System.out.println(RemoteControl.MIN_VOLUME);
    }
}
