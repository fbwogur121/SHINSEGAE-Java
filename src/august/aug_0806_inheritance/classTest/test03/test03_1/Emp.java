package august.aug_0806_inheritance.classTest.test03.test03_1;

public class Emp {
    private static String id;
    private static String name;
    private static int baseSalary;

    double getSalary(double bonus) {
        return this.getBaseSalary() + this.getBaseSalary() * bonus ;
    }

    public String toString() {
        return this.getName()+"("+this.getId()+") 사원의 기본급은 "+this.getBaseSalary()+"원입니다.";
    }

    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public int getBaseSalary() {
        return this.baseSalary;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(int baseSalary) { this.baseSalary = baseSalary; }
}
