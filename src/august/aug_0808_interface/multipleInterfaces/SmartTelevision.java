package august.aug_0808_interface.multipleInterfaces;

public class SmartTelevision implements RemoteControl, Searchable{
    @Override
    public void turnOn() {
        System.out.println("TV 전원 on");
    }

    @Override
    public void turnOff() {
        System.out.println("TV 전원 off");
    }

    @Override
    public void search(String url) {
        System.out.println(url + " 검색합니다.");
    }

}
