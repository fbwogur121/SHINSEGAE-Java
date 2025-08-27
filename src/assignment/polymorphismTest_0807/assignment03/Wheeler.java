package assignment.polymorphismTest_0807.assignment03;

abstract public class Wheeler {
    protected int velocity;
    protected String carName;
    protected int wheelNumber;

    public Wheeler(){}


    abstract public void speedUp(int speed);

    abstract public void speedDown(int speed);

    public void stop() {
        setVelocity(0);
        System.out.println("정지상태로 속도를 0으로 초기화합니다.");
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }
}

