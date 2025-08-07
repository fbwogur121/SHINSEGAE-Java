package assignment.polymorphismTest.assignment03;

public class Truck extends Wheeler{

    public Truck(String carName, int velocity, int wheelNumber){
        super.setCarName(carName);
        super.setVelocity(velocity);
        super.setWheelNumber(wheelNumber);
    }


    @Override
    public void speedUp(int speed) {
        if((getVelocity() + 5*speed) <= 100)
            setVelocity(getVelocity() + 5*speed);
        else{
            setVelocity(100);
            System.out.println("트럭의 최고속도위반으로 속도를 100으로 내립니다.");
        }
    }

    @Override
    public void speedDown(int speed) {
        if((getVelocity() - 5*speed) >= 50)
            setVelocity(getVelocity() - 5*speed);
        else{
            setVelocity(50);
            System.out.println("트럭의 최저속도위반으로 속도를 50으로 올립니다.");
        }
    }
}
