package assignment.interfaceTest_0808.interfaceTest02;

public class CarFactory extends Factory implements IWorkingTogether {

    private int result;

    public CarFactory(String name, int openHour, int closeHour) {
        super(name, openHour, closeHour);
    }

    public void makeProducts(char skill) {
        int res;
        switch (skill) {
            case ('A'):
                res = getWorkingTime() * 3;
                break;
            case ('B'):
                res = getWorkingTime() * 2;
                break;
            case ('C'):
                res = getWorkingTime();
                break;
            default:
                res = 0;
                break;
        }
        setResult(res);
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        return getWorkingTime() * 2;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public int getResult() {
        return result;
    }
}
