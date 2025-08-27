package assignment.polymorphismTest_0807.assignment02.problem1;

public class Tea extends Beverage {
    private static int amount = 0;

    public Tea(String name) {
        super(name);
        setAmount();
    }

    @Override
    public void calcPrice() {
        switch (getName()) {
            case ("lemonTea"):
                setPrice(1500);
                break;
            case ("ginsengTea"):
                setPrice(2000);
                break;
            case ("redginsengTea"):
                setPrice(2500);
                break;
            default:
                setPrice(0);
                break;
        }
    }

    public static int getAmount() {
        return amount;
    }

    public void setAmount() {
        this.amount += 1;
    }

}
