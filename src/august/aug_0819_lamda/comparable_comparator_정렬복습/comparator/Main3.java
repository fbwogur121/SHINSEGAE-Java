package august.aug_0819_lamda.comparable_comparator_정렬복습.comparator;

import java.util.Arrays;
import java.util.Comparator;

// 2. Comparator 인터페이스 방법
// 익명 객체를 이용하여 좀 더 유연하게 다양한 속성을 이용해서 정렬할 수 있다.
// 만약 나이순으로 정렬했는데, 나이가 같은 사람이 있다면 추가적으로 이름순으로 정렬기준을 제시해 주어야 한다.
// 객체의 여러 속성을 이용하여 정렬하려면, Comparator 인터페이스 comparing(), thenCompare()

public class Main3 {
    public static void main(String[] args) {
        class User {
            private String name;
            private int age;
            public User(String name, int age) {
                this.name = name;
                this.age = age;
            }
            public String getName() {
                return name;
            }
            public int getAge() {
                return age;
            }
        }

        User[] users = new User[]{
                new User("김유신", 64),
                new User("홍길동", 48),
                new User("김동성", 48),
                new User("박희동", 14)
        };

        System.out.println("====나이 오름차순 정렬===Comparator===");
        Arrays.sort(users, Comparator.comparing(User::getAge));
        for (User user : users) {
            System.out.println(user.getName() + " " + user.getAge() + "세");
        }

        System.out.println("====이름 오름차순 정렬===Comparator===");
        Arrays.sort(users, Comparator.comparing(User::getName)); // 나이순 정렬
        for (User user : users) {
            System.out.println(user.getName() + " " + user.getAge() + "세");
        }

        System.out.println("====나이 오름차순 정렬 후 같은 나이 있다면 이름 오름차순===Compare===");
        Arrays.sort(users, Comparator.comparing(User::getAge).thenComparing(User::getName));
        for (User user : users) {
            System.out.println(user.getName() + " " + user.getAge() + "세");
        }

    }
}
