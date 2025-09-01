package august.aug_0807_abstract.finalClassAndMethodExample.ex02;

public class SportsCar extends Car {
    @Override
    public void speedUp() {
        speed += 10;
        if (speed == 0) {
            super.stop();
        }
    }
}