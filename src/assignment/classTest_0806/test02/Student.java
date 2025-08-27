package assignment.classTest_0806.test02;

public class Student {
    private static String name;
    private static int age;
    private static int id;

    void print() {
        System.out.println("이  름 : " + this.getName() + "\t나이 : " + this.getAge() + "\t담당과목 : " + this.getId());
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getId() {
        return this.id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }
}
