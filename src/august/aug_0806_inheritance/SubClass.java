package august.aug_0806_inheritance;

public class SubClass extends SuperClass {
    public int cc = 30;

    void adder(){
        int res1 = super.getAA() + super.bb + this.cc; //super에는 부모객체의 주소값이 담겨 있다.
        int res2 = this.getAA() + bb + cc;
        System.out.println(res1);
        System.out.println(res2);
    }

    public static void main(String[] args) {
        SubClass b = new SubClass();
        System.out.println(b.getAA());
        b.adder();
        b.printAA();
    }
}
