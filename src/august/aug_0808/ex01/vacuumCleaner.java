package august.aug_0808.ex01;

public class vacuumCleaner implements RemoteControl {
    private int time;

    @Override
    public void setVolume(int volume) {

    }

    @Override
    public void setMute(boolean mute) {

    }

    public vacuumCleaner(int time) {
        setTime(time);
    }

    @Override
    public void turnOn() {
        System.out.println("청소기 전원을 켠다");
        cleaning(time);
    }

    @Override
    public void turnOff() {
        System.out.println("청소기 전원을 끈다");

    }

    public void cleaning(int time) {
        System.out.println("청소기를 " + time + "분 돌립니다.");
    }

    public void setTime(int time) {
        this.time = time;
    }
}
