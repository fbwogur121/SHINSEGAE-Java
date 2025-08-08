package august.aug_0808_interface.interface_ex02;

public class User {
    public static void main(String[] args) {
        Service service1 = new ServiceImpl1();

        //디폴트 메소드 호출
        service1.defaultMethod1();
        service1.defaultMethod2();

        // private 메소드
        Service.staticMethod1();
        Service.staticMethod2();

    }
}
