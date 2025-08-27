package assignment.inheritanceTest_0806.problem2;

public class Student {
    private String name;
    private String subject;
    private int fee;
    private double returnFee;

    public Student(String name, String subject, int fee) {
        setName(name);
        setSubject(subject);
        setFee(fee);
    }

    public void calcReturnFee() {
        if (getSubject().equals("javaprogram")) {
            setReturnFee(getFee() * (25.0 / 100));
        } else if (getSubject().equals("jspprogram")) {
            setReturnFee(getFee() * (2.0 / 10));
        } else {
            System.out.println("그런 과정명은 없습니다.");
        }
    }

    public void print() {
        System.out.println(getName() + " 씨의 과정명은 " + getSubject() + " 이고 교육비는 " + getFee() + " 이며 환급금은 " + getReturnFee() + "원 입니다.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getFee() {
        return this.fee;
    }

    public void setReturnFee(double returnFee) {
        this.returnFee = returnFee;
    }

    public int getReturnFee() {
        return (int) this.returnFee;
    }

    public static void main(String args[]) {
        Student stu = new Student("장동건", "jspprogram", 500000);
        stu.calcReturnFee();
        stu.print();
    }
}