package august.aug_0806_inheritance.abcExample;

public class BB extends AA {
    private int cc = 30;

    int getCC(){
        return cc;
    }

    void adder(){
        int res1 = super.getAA() + super.getBB() + this.cc; //super에는 부모객체의 주소값이 담겨 있다.
        int res2 = this.getAA() + this.getBB() + cc;
        System.out.println("a+b+c = "+res1);
        System.out.println("a+b+c = "+res2);
    }
}
