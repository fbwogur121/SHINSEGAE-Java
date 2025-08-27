package assignment.inheritanceTest_0806.problem1;

public class Drink {
    private String name;
    private int price;
    private int count;

    public Drink(String name, int price, int count) {
        setName(name);
        setPrice(price);
        setCount(count);
    }

    public static void printTitle() {
        System.out.println("상품명\t단가\t\t수량\t\t금액");
    }

    public int getTotalPrice() {
        return getPrice() * getCount();
    }

    public void printData() {
        System.out.println(getName() + "\t\t" + getPrice() + "\t" + getCount() + "\t\t" + getTotalPrice());
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return this.count;
    }
}
