package assignment.polymorphismTest.assignment01;

public class Circle extends Shape {

    private double radius;

    public Circle(String name, int radius) {
        super(name);
        setRadius(radius);
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculationArea() {
        double area = Math.PI * getRadius() * getRadius();
        setArea(area);
    }
}
