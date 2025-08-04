package july.jul_0728;

public class RandomEx01 {
    public static void main(String[] args) {
        Math.random(); //0.0 <= Math.random() < 1.0
        //0.0 * 6 <= Math.random() *6 < 1.0*6
        //(int) 0.6 <= Math.random()*6 < 6.0
        // 0, 1, 2, 3, 4, 5

        //복권번호 생성
        int number = (int) (Math.random() * 45) + 1;

        //start 부터 시작하는 n개의 정수 중에서 하나의 정수를 얻기 위한 코드를 작성
        //int num = (int)(Math.random() * n) + start;
    }
}
