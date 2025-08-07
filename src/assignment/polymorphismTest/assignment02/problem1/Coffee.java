package assignment.polymorphismTest.assignment02.problem1;

public class Coffee extends Beverage {
    private static int amount = 0;

    public Coffee(String name) {
        super(name);
        setAmount();
    }

    @Override
    public void calcPrice() {
        switch (getName()) {
            case ("Americano"):
                setPrice(1500);
                break;
            case ("CafeLatte"):
                setPrice(2500);
                break;
            case ("Cappuccino"):
                setPrice(3000);
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
