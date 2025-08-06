package assignment.constructorTest.problem2;

public class Rectangle {
    private int width;
    private int length;
    private String color;

    Rectangle(int width, int length, String color) {
        setWidth(width);
        setLength(length);
        setColor(color);
    }

    Rectangle(int width, int length) {
        setWidth(width);
        setLength(length);
        setColor("흰색");
    }

    Rectangle() {

    }

    public int area() {
        return getWidth() * getLength();
    }

    public int perimeter() {
        return 2 * (getWidth() + getLength());
    }

    public int getWidth() {
        return this.width;
    }


    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
