package august.aug_0808_interface.interface_inheritance;

public class User {
    public static void main(String[] args) {
        // ia, ib, ic 각 사람에 따라 권한을 다르게 주는 것 (구독/등급서비스 인터페이스 구현)
        
        InterfaceImpl impl = new InterfaceImpl();

        InterfaceA ia = impl;
        ia.methodA();

        InterfaceB ib = impl;
        ib.methodB();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();

    }
}
