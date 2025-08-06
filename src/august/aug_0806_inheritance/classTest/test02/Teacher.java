package august.aug_0806_inheritance.classTest.test02;

public class Teacher {
    private static String name;
    private static int age;
    private static String subject;

    void print() {
        System.out.println("이  름 : "+this.getName() + "\t나이 : "+this.getAge() + "\t담당과목 : "+this.getSubject());
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public String getSubject() {
        return this.subject;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
