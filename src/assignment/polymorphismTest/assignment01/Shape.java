package assignment.polymorphismTest.assignment01;

public abstract class Shape {
    private double area;
    private String name;


    public Shape() {

    }

    public Shape(String name) {
        setName(name);
    }

    public abstract void calculationArea();

    public void print() {
        System.out.println(getName() + "의 면적은" + getArea());
    }

    public double getArea() {
        return this.area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
