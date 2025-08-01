package july.Jul_0801;

public class RefEx01 {
    public static void main(String[] args) {
        String refVar1 = null;
        String refVar2 = null;

        refVar1 = new String("자바");
        refVar2 = "자바";
        String refVar3 = "자바";
        String refVar4 = null;

        // 메모리 번지수를 비교
        System.out.println(refVar1 == refVar2);
        System.out.println(refVar1 == refVar3);
        System.out.println(refVar2 == refVar3);
        System.out.println("=======================");

        // 문자열 값을 비교(자바 == 자바)
        System.out.println(refVar1.equals(refVar2));
        System.out.println(refVar2.equals(refVar3));


        System.out.println("===NullPointException===");
        System.out.println(refVar4);
        System.out.println(refVar4.length());
    }
}
