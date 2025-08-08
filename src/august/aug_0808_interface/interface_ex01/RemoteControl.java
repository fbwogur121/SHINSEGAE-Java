package august.aug_0808_interface.interface_ex01;

public interface RemoteControl {
    //최대 볼륨은 30, 최소 볼륨은 0
    int MAX_VOLUME = 30; // public static int 생략가능
    int MIN_VOLUME = 0;

    //추상메소드
    public void turnOn(); // 추상 메서드( { } 구현부 없음)
    public void turnOff();
    public void setVolume(int volume);  // 봄륨 조정 기능


    public void setMute(boolean mute);
//    // 디폴트 인스턴스 메소드
//    default void setMute(boolean mute){
//        if(mute){
//            System.out.println("무음 처리 작동시작");
//            setVolume(MIN_VOLUME);
//        } else{
//            System.out.println("무음 해제");
//        }
//        coolDown();
//    }

    //정적 메소드
    static void changeBattery(){
        System.out.println("리모컨 건전지를 교체합니다.");
        //정적 필드 접근 가능  private static method 호출 가능
        System.out.println(RemoteControl.MAX_VOLUME);

        //setMute(true);  인스턴스메소드, 디폴트 메소드, pirvate 메소드 호출 불가
    }

    private void coolDown(){

    }
}
