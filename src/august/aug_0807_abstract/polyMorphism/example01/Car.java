package august.aug_0807_abstract.polyMorphism.example01;

public class Car {
    //필드 선언 : 자동차는 타이어가 필요하다.
    public Tire tire;


    //메소드 선언 : 자동차는 바퀴를 굴려서 움직인다.
    public void run(){
        tire.roll();
    }

}
