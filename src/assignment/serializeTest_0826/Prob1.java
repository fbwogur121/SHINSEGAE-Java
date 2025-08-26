package assignment.serializeTest_0826;

/*
다음 조건을 만족하는 `Person` 클래스를 정의하고, `person.dat` 파일에 객체를 직렬화/역직렬화하는 프로그램을 작성하시오.
- `name(String)`, `age(int)` 필드를 가진다.
- `Serializable`을 구현한다.
- `age`는 `transient` 처리한다.
- `main` 메서드에서 `Person("홍길동", 30)`을 파일에 저장한 후 다시 읽어와서 콘솔에 출력하라.
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Person implements Serializable{
    private static final long serialVersionUID = 1L;
    private String name;
    private transient int age;
}

public class Prob1 {

    public static void main(String[] args) throws Exception {
        String fileName = "prob1.dat";

        Person hong = new Person("홍길동", 30);
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(hong);

        oos.flush();
        oos.close();
        fos.flush();
        fos.close();

        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);

        try {
            while(true){
                Object obj = ois.readObject();
                System.out.println(obj);
            }
        } catch (EOFException e){
            System.out.println("파일 읽기 완료");
        } finally {
            ois.close();
            fis.close();
        }

    }
}
