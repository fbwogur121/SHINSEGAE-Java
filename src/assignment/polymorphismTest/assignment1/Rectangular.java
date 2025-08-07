package assignment.polymorphismTest.assignment1;

public class Rectangular extends Shape {

    private double width;
    private double hight;


    public Rectangular(String name, int width, int hight) {
        super(name);
        setWidth(width);
        setHight(hight);
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHight() {
        return this.hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    @Override
    public void calculationArea() {
        double area = getHight() * getWidth();
        setArea(area);
    }
}
