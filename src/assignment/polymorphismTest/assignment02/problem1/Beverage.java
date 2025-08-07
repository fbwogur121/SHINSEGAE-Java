package assignment.polymorphismTest.assignment02.problem1;

public abstract class Beverage {
    private String name;
    private int price;

    public Beverage(String name) {
        setName(name);
        calcPrice();
    }

    public abstract void calcPrice();

    public void print(int order) {
        System.out.println(order + "번째 판매 음료는 " + getName() + "이며, 가격은 " + getPrice());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
