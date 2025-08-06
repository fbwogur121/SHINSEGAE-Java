package assignment.inheritanceTest.problem1;

public class Alcohol extends Drink {
    private double alcper;

    public Alcohol(String name, int price, int count, double alcper) {
        super(name, price, count);
        setAlcper(alcper);
    }

    public void setAlcper(double alcper) {
        this.alcper = alcper;
    }

    public double getAlcper() {
        return this.alcper;
    }

    public static void printTitle() {
        System.out.println("상품명(도수[%])\t단가\t\t수량\t\t금액");
    }

    public void printData() {
        System.out.println(getName() + "(" + getAlcper() + ")\t\t" + getPrice() + "\t" + getCount() + "\t\t" + getTotalPrice());
    }
}
