package assignment.serializeTest_0826;

/*
아래 조건을 만족하는 `Book` 클래스를 작성하고, 여러 객체를 리스트로 만들어 한 번에 직렬화/역직렬화하라.

- `title(String)`, `price(int)` 필드를 가진다.
- `serialVersionUID`를 명시적으로 선언한다.
- `main` 메서드에서 `ArrayList<Book>`을 생성해 3권의 책 정보를 저장한 후, 파일(`books.dat`)로 저장하고 다시 읽어와 리스트 전체를 출력하라.
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Book implements Serializable{
    private static final long serialVersionUID = 1L;
    private String title;
    private int price;
}

public class Prob2 {
    public static void main(String[] args) throws Exception {
        String fileName = "prob2.dat";

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("book1", 100));
        books.add(new Book("book2", 200));
        books.add(new Book("book3", 300));

        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(books);

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
