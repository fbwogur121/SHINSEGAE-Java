package august.aug_0819_lambda.comparable_comparator_정렬복습.comparable;

/*
결과
박희동 14세
홍길동 32세
김동성 48세
김유신 64세

위 결과와 같이 나이로 오름차순이 될 수 있도록 User 클래스를 만들어 구현하시오
 */



// 1. Comparable 인터페이스 방법
// 자바에서는 같은 타입의 인스턴스를 비교할때 Comparabel 인터페이스를 구현 : compareTo() 오버라이딩

// 2. Comparator 인터페이스 방법
// 익명 객체를 이용하여 좀 더 유연하게 이용해서 정렬할 수 있다.

import java.util.Arrays;
import java.util.Collections;

public class Main1 {

    public static void main(String[] args) {
        class User implements Comparable<User> {
            String name;
            int age;

            public User(String name, int age){
                this.name = name;
                this.age = age;
            }

            @Override
            public int compareTo(User o) {
                // 비교로직 구현. 내가 크다면 1, 같다면 0, 내가 작다면 -1 리턴
                if(this.age < o.age) return -1;
                else if (this.age > o.age) return 1;
                else return 0;
            }
        }

        User[] users = new User[]{
                new User("김유신", 64),
                new User("홍길동", 32),
                new User("김동성", 48),
                new User("박희동", 14)
        };

        Arrays.sort(users);
        System.out.println("====나이 오름차순 정렬====");
        for( User u : users){
            System.out.println(u.name + " " + u.age + "세");
        }
        System.out.println("====나이 내림차순 정렬====");
        Arrays.sort(users, Collections.reverseOrder());
        for( User u : users){
            System.out.println(u.name + " " + u.age + "세");
        }
    }
}
