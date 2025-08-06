package august.aug_0806_inheritance.classTest.test02;

public class Employee {
    private static String name;
    private static int age;
    private static String department;

    void print() {
        System.out.println("이  름 : "+this.getName() + "\t나이 : "+this.getAge() + "\t담당과목 : "+this.getDepartment());
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public String getDepartment() {
        return this.department;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDept(String department) {
        this.department = department;
    }
}
