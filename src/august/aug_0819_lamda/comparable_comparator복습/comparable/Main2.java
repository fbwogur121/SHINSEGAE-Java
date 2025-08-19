package august.aug_0819_lamda.comparable_comparator복습.comparable;

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
// 익명 객체를 이용하여 좀 더 유연하게 다양한 속성을 이용해서 정렬할 수 있다.
// 만약 나이순으로 정렬했는데, 나이가 같은 사람이 있다면 추가적으로 이름순으로 정렬기준을 제시해 주어야 한다.
// 객체의 여러 속성을 이용하여 정렬하려면, Comparator 인터페이스 comparing(), thenCompare()

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main2 {

    public static void main(String[] args) {
        class User {
            String name;
            int age;

            public User(String name, int age) {
                this.name = name;
                this.age = age;
            }

        }

        User[] users = new User[]{
                new User("김유신", 64),
                new User("홍길동", 32),
                new User("김동성", 48),
                new User("박희동", 14)
        };

        System.out.println("====나이 오름차순 정렬===Compare===");
        Arrays.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return Integer.compare(o1.age, o2.age); // Integer 클래스에 정의된 compare 함수로 두 정수값을 비교
            }
        });
        for (User u : users) {
            System.out.println(u.name + " " + u.age + "세");
        }

        // lamda식으로 변형 : 위의 6줄을 1줄로 바꿀수있다.
        Arrays.sort(users, (User u1, User u2) -> Integer.compare(u1.age, u2.age)); // 람다식으로 표현한 나이 오름차순 정렬


        System.out.println("====이름 오름차순 정렬===CompareTo===");
        Arrays.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.name.compareTo(o2.name); // compareTo 함수로 두 값을 비교
            }
        });
        Arrays.sort(users, (User u1, User u2) -> u1.name.compareTo(u2.name));
        for (User u : users) {
            System.out.println(u.name + " " + u.age + "세");
        }
    }
}
