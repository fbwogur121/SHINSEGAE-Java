package javabasic_02.test.loop_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaBasic9 {
    static int studentNum;
    static Student[] students;
    static int maxScore;
    static int sumScore;
    static double avgScore;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            information();
            int n = Integer.parseInt(br.readLine());

            if (n < 1 || n > 5) {
                System.out.println("잘못된 입력입니다. 1번~5번 중 골라주세요.\n");
                continue;
            }

            switch (n) {
                case 1:
                    inputStudentNum(br);
                    break;
                case 2:
                    inputScore(br);
                    break;
                case 3:
                    scoreList();
                    break;
                case 4:
                    analyze();
                    break;
                case 5:
                    System.out.print("프로그램 종료");
                    return;
            }
        }
    }

    public static void information() {
        System.out.println("---------------------------------------------");
        System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
        System.out.println("---------------------------------------------");
        System.out.print("선택> ");
    }

    public static void inputStudentNum(BufferedReader br) throws IOException {
        System.out.print("학생수> ");
        studentNum = Integer.parseInt(br.readLine());

        students = new Student[studentNum];
        maxScore = Integer.MIN_VALUE;
        sumScore = 0;
        avgScore = 0;
    }

    public static void inputScore(BufferedReader br) throws IOException {
        for (int i = 0; i < studentNum; i++) {
            System.out.printf("scores[%d]> ", i);
            int score = Integer.parseInt(br.readLine());
            students[i] = new Student(score);
            sumScore += score;
            if (score > maxScore) maxScore = score;
        }
    }

    public static void scoreList() {
        for (int i = 0; i < studentNum; i++) {
            System.out.printf("scores[%d]> %d\n", i, students[i].getScore());
        }
    }

    public static void analyze() {
        if (studentNum == 0) {
            System.out.println("학생 수가 0입니다. 분석할 수 없습니다.");
            return;
        }
        avgScore = sumScore / (double) studentNum;
        System.out.printf("최고 점수: %d\n평균 점수: %.1f\n", maxScore, avgScore);
    }
}
