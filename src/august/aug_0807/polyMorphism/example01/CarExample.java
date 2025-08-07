package august.aug_0807.polyMorphism.example01;

public class CarExample {
    public static void main(String[] args) {
        //Car 객체 생성
        Car myDreamCar = new Car();

        //Tire 객체 장착
        myDreamCar.tire = new Tire();
        myDreamCar.run(); // 회전합니다 출력

        //HankookTire 객체 장착
        myDreamCar.tire = new KumhoTire();
        myDreamCar.run();

        //KumhoTire 객체 장착
        myDreamCar.tire = new HankookTire();
        myDreamCar.run();
    }
}