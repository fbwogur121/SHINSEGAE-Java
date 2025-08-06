package assignment.constructorTest.problem1;

public class Rectangle {
    private int width;
    private int height;
    private String color;
    private int area;

    Rectangle(int width, int height, String color) {
        setWidth(width);
        setHeight(height);
        setColor(color);
        setArea(width, height);
    }

    Rectangle(int width, int height) {
        setWidth(width);
        setHeight(height);
        setColor("흰색");
        setArea(width, height);
    }

    Rectangle() {

    }

    public void calculateArea() {
        this.area = getWidth() * getHeight();
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getArea() {
        return this.area;
    }

    public void setArea(int width, int height) {
        this.area = width * height;
    }

}
