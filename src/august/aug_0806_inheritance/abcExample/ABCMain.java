package august.aug_0806_inheritance.abcExample;

public class ABCMain {
    public static void main(String[] args) {
        CC c = new CC();
        System.out.println("a : " + c.getAA());
        System.out.println("b : " + c.getBB());
        System.out.println("c : " + c.getCC());
        System.out.println("d : " + c.getDD());

        c.adder();
    }
}
