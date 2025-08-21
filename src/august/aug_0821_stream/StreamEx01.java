package august.aug_0821_stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamEx01 {
    public static void main(String[] args) {

        /* 지금까지 컬렉션이나 배열에서는 저장된 요소를 반복처리하기 위해서는
           for 또는 iterator(반복자) 를 이용했다.*/
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        // Java8 이전 발전순서
        // 1. for문 사용
        for (int i = 0; i < list.size(); i++) {
            String item = list.get(i);
            System.out.println(item);
        }
        // 2. Iterator 사용
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String item = iterator.next();
            System.out.println(item); // 요소 처리 => 콘솔창에 요소의 값을 확인하겠다.
        }
        // 3. 향상된 for문 사용
        for (String item : list) {
            System.out.println(item);
        }

        // Java8 부터 Stream을 사용하여 요소들이 하나씩 흘러가면서 처리하는 방법을 제시함.
        // 병렬처리 가능 / 단방향이 아닌 양방향이 가능.
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);

        // Set에 홍길동, 김나무, 김꽃분 세명의 회원을 저장하고 stream을 이용하여 이름을 출력
        // 1. set 컬렉션 stringSet 생성
        Set<String> stringSet = new HashSet<String>();
        // 2. 회원의 이름을 저장
        stringSet.add("홍길동");
        stringSet.add("김나무");
        stringSet.add("김꽃분"); // set : 순서 없고 중복혀용x
        // 3. names에 Stream 방식을 통하여 요소(이름)을 출력처리
        Stream<String> users = stringSet.stream(); // 스트림 얻기
        //users.forEach(System.out::println);
        users.forEach(name -> System.out.println(name));
        /*
        1. 내부 반복자이므로 처리 속도가 빠르고 병렬처리에 효율적이다.
        2. 람다식으로 다양한 요소 처리가 가능하다
        3. 중간처리와 최종처리를 수행하도록 파이프라인을 형성할 수 있다.
         */
    }
}
