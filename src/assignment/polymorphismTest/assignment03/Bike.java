package assignment.polymorphismTest.assignment03;

public class Bike extends Wheeler {

    public Bike(String carName, int velocity, int wheelNumber){
        super.setCarName(carName);
        super.setVelocity(velocity);
        super.setWheelNumber(wheelNumber);
    }


    @Override
    public void speedUp(int speed) {
        if((getVelocity() + speed) <= 40)
            setVelocity(getVelocity() + speed);
        else{
            setVelocity(40);
            System.out.println("자전거의 최고속도위반으로 속도를 40으로 내립니다.");
        }
    }

    @Override
    public void speedDown(int speed) {
        if((getVelocity() - speed) >= 10)
            setVelocity(getVelocity() - speed);
        else{
            setVelocity(10);
            System.out.println("트럭의 최저속도위반으로 속도를 10으로 올립니다.");
        }
    }
}
