package Algorithm.Jungol.배열.배열1;

public class 자가진단2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0; i<10; i++){
            arr[i] = i+1;
        }
        for(int j = 0; j < 10; j++){
            System.out.print(arr[j]+" ");
        }
    }
}
