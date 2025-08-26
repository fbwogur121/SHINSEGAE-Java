package assignment.serializeTest_0826;

/*
아래 조건을 만족하는 `Student` 클래스를 작성하라.

그리고 `students.dat`에 학생 객체 2개를 차례대로 직렬화한 후, 파일에서 하나씩 역직렬화하여 출력하라.

- `name(String)`, `grade(int)` 필드를 가진다.
- `Serializable`을 구현한다.
- 파일을 읽을 때는 `EOFException`을 활용하여 종료하라.
 */

import august.aug_0806_inheritance.abcdefExample.F;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.management.ObjectInstance;
import java.io.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Student implements Serializable{
    private static final long serialVersionUID = 1L;
    private String name;
    private int grade;
}

public class Prob3 {
    public static void main(String[] args) throws Exception {
        String fileName = "prob3.dat";

        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Student student1 = new Student("학생1", 1);
        Student student2 = new Student("학생2", 2);

        oos.writeObject(student1);
        oos.writeObject(student2);

        oos.flush();
        oos.close();
        fos.flush();
        fos.close();

        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);

        try{
            while(true){
                Object obj = ois.readObject();
                System.out.println(obj);
            }
        } catch (EOFException e){
            System.out.println("파일 읽기 끝");
        } finally {
            ois.close();
            fis.close();
        }

    }
}
