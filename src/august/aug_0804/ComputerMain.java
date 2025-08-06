package august.aug_0804;

public class ComputerMain {
    public static void main(String[] args) {
        Computer myCom = new Computer();
        int result = 0;

        result = myCom.totalSum(1,2,3);
        System.out.println(result);

        result = myCom.totalSum(1,2,3,4,5);
        System.out.println(result);

        int[] values = {1,2,3,4,5};
        result = myCom.totalSum(values);

        result = myCom.totalSum(new int[] {1,2,3,4,5,6,7});
        System.out.println(result);
    }
}
