package assignment.classTest_0806.test03.test03_3;

public class Duck {
    private String name;
    private int legs;
    private int length;

    public String toString() {
        return "오리의 이름은 " + this.getName() + " 입니다.";
    }

    public void fly() {
        System.out.println("오리(" + this.getName() + ")는 날지 않습니다.");
    }

    public void sing() {
        System.out.println("오리(" + this.getName() + ")가 소리내어 웁니다.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name = name;
    }
}
