package august.aug_0807_abstract.phoneClass;

public class SmartPhoneExample {
    public static void main(String[] args) {
        //SmartPhone 객체 생성
        SmartPhone myPhone1 = new SmartPhone();


        //Phone으로부터 상속받은 필드 읽기
        SmartPhone myPhone2 = new SmartPhone("갤럭시24", "화이트");

        System.out.println(myPhone1.model + " " + myPhone1.color + " " + myPhone1.wifi);
        System.out.println(myPhone2.model + " " + myPhone2.color + " " + myPhone2.wifi);

        //SmartPhone의 필드 읽기
        System.out.println("와이파이 상태 체크 : " + myPhone2.wifi);
        myPhone2.setWifi(true);
        System.out.println("와이파이 상태 체크 : " + myPhone2.wifi);

        //Phone으로부터 상속받은 메소드 호출
        myPhone2.bell();
        myPhone2.receiveVoice("안녕하세요");
        myPhone2.sendVoice("네 안녕하세요");
        myPhone2.hangUp();

        //SmartPhone의 메소드 호출
        myPhone2.internet();

    }
}
