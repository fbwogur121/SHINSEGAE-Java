package assignment.interfaceTest_0808.interfaceTest02;

public class TVFactory extends Factory implements IWorkingTogether {

    private int result;

    public TVFactory(String name, int openHour, int closeHour) {
        super(name, openHour, closeHour);
    }

    public void makeProducts(char skill) {
        int res;
        switch (skill) {
            case ('A'):
                res = getWorkingTime() * 8;
                break;
            case ('B'):
                res = getWorkingTime() * 5;
                break;
            case ('C'):
                res = getWorkingTime() * 3;
                break;
            default:
                res = getWorkingTime();
                break;
        }
        setResult(res);
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        return getWorkingTime() * 3;
    }

    @Override
    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
