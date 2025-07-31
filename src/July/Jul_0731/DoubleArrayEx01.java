package July.Jul_0731;

import java.io.IOException;

public class DoubleArrayEx01 {
    public static void main(String[] args) throws IOException {
        //점수 : 1열 국어/2열 영어/3열 수학
        int[][] scores = new int[3][3];

        //총합, 평균
        double[][] sumAvg = new double[3][2];

        // 1번학생의 국어 90 영어 50 수학 80
        scores[0][0] = 90;
        scores[0][1] = 50;
        scores[0][2] = 80;

        // 2번학생의 국어 80 영어 100 수학 90
        scores[1][0] = 80;
        scores[1][1] = 100;
        scores[1][2] = 90;

        // 2번학생의 국어 100 영어 90 수학 90
        scores[2][0] = 100;
        scores[2][1] = 90;
        scores[2][2] = 90;

        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                if(j==0) {
                    System.out.printf("%d번 학생의 국어 점수: %d\n", i+1, scores[i][j]);
                }
                if(j==1) {
                    System.out.printf("%d번 학생의 영어 점수: %d\n", i+1, scores[i][j]);
                }
                if(j==2) {
                    System.out.printf("%d번 학생의 수학 점수: %d\n", i+1, scores[i][j]);
                }
                sumAvg[i][0] += scores[i][j];
            }
            sumAvg[i][1] = sumAvg[i][0]/3;
            System.out.printf("%d번 학생의 국,영,수 총합: %.0f 평균: %.1f\n\n",i+1, sumAvg[i][0], sumAvg[i][1]);
        }
    }
}
