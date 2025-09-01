package august.aug_0807_abstract.abstractClass.example02;

public abstract class Animal {
    //메소드 선언
    public void breathe(){
        System.out.println("동물은 숨을 쉰다.");
    }

    //추상 메소드 선언 -> 시그니쳐만 선언하고 구현부는 없음.
    public abstract void sound();
}