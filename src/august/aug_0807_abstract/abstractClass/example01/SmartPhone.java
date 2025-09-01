package august.aug_0807_abstract.abstractClass.example01;

public class SmartPhone extends Phone {
    //생성자 선언
    SmartPhone(String owner) {
        super(owner);
    }

    //메소드 선언
    void internet(){
        System.out.println("인터넷을 사용합니다.");
    }

}