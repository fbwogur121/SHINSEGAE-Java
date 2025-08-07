package august.aug_0807.abstractClass.example01;

public class PhoneExample {
    public static void main(String[] args) {
        // Phone phone = new Phone();  -> abstract 클래스이므로 인스턴스 할당 불가

        SmartPhone smartPhone = new SmartPhone("신세계");
        smartPhone.turnOn();
        smartPhone.internet();
        smartPhone.turnOff();
    }
}