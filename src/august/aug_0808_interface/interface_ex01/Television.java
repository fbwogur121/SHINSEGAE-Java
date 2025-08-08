package august.aug_0808_interface.interface_ex01;

public class Television implements RemoteControl {
    // 필드 volume
    private int volume;

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME)
            this.volume = MAX_VOLUME;
        else if (volume < RemoteControl.MIN_VOLUME)
            this.volume = MIN_VOLUME;
        else
            this.volume = volume;

        System.out.println("현재 TV의 볼륨 : " + this.volume);
    }


    private int memoryVolume; // 음소거 전 원래 볼륨값 저장공간

    @Override
    public void setMute(boolean mute) {
        if (mute) {
            this.memoryVolume = this.volume;
            System.out.println("무음 모드");
            setVolume(RemoteControl.MIN_VOLUME);
        } else {
            System.out.println("무음 해제");
            setVolume(this.memoryVolume);
        }
    }


    @Override
    public void turnOn() {
        System.out.println("TV 전원을 켠다");
    }

    @Override
    public void turnOff() {
        System.out.println("TV 전원을 끈다");
    }

}
