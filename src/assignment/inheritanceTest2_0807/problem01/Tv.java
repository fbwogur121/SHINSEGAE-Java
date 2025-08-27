package assignment.inheritanceTest2_0807.problem01;

public class Tv {
    private String color;
    private boolean power;
    private int channel;

    public Tv() {
        setColor("black");
        setPower(false);
        setChannel(0);
    }

    public void power() {
        this.power = !getPower();
    }

    public void channelUp() {
        this.channel += 1;
    }

    public void channelDown() {
        this.channel -= 1;
    }

    public void print() {
        System.out.println("color : " + getColor() + "\tpower : " + getPower() + "\tchannel : " + getChannel());
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public boolean getPower() {
        return this.power;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getChannel() {
        return this.channel;
    }
}
