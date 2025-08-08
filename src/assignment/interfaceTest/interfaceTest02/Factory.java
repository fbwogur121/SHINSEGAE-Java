package assignment.interfaceTest.interfaceTest02;

public abstract class Factory {
    private String factoryName;
    private int openHour;
    private int closeHour;

    public Factory(String name, int openHour, int closeHour) {
        setFactoryName(name);
        setOpenHour(openHour);
        setCloseHour(closeHour);
    }

    public int getWorkingTime() {
        return getCloseHour() - getOpenHour();
    }

    abstract void makeProducts(char skill);

    abstract int getResult();

    public int getOpenHour() {
        return openHour;
    }

    public void setOpenHour(int openHour) {
        this.openHour = openHour;
    }

    public int getCloseHour() {
        return closeHour;
    }

    public void setCloseHour(int closeHour) {
        this.closeHour = closeHour;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }
}
