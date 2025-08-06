package algorithm.jungol.배열.배열1;

public class 연습문제2 {
    public static void main(String[] args) {
        char[] arr = new char[26];
        for(int i = 0; i<26; i++){
            arr[i] = (char)('A'+i);
        }
        for(int j =25; j>=0; j--){
            System.out.print(arr[j] + " ");
        }
    }
}
