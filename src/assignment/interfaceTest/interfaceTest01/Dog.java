package assignment.interfaceTest.interfaceTest01;

public class Dog extends Animal {
    public Dog(int speed) {
        super(speed);
    }

    @Override
    void run(int hours) {
        setDistance((double) (getSpeed() * hours) / 2);
        getDistance();
    }
}
