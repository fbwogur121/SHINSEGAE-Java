package august.aug_0821_stream.streamPipeLine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineEx {
    public static void main(String[] args) {
        // 방법 1. Stream을 얻고 -> 중간처리 -> 최종처리 ==> 학생들의 평균점수
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("김진우", 100));
        students.add(new Student("이종우", 95));
        students.add(new Student("박진우", 80));

        Stream<Student> studentStream1 = students.stream();
        // 중간처리 : 학생객체를 점수(정수타입)로 매핑
        IntStream scoreStream = studentStream1.mapToInt(
                student -> student.getScore()
        );
        // 최종처리(평균구하기)
        double averageScore = scoreStream.average().getAsDouble();
        System.out.println(averageScore);

        System.out.println("============================================");

        // 방법 2. 람다식을 주입해서 파이프라인 처리 형식
        List<Student> studentList = Arrays.asList(
                new Student("김진우", 90),
                new Student("이종우", 95),
                new Student("박진우", 80)
        );
        double averageScore2 = studentList.stream()
                .mapToInt(student -> student.getScore())
                .average()
                .getAsDouble();
        System.out.println(averageScore2);
    }
}
