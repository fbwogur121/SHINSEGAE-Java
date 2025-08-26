package assignment.serializeTest_0826;

/*
다음 요구사항을 만족하는 **커스텀 직렬화**를 구현하라.

- `Account` 클래스는 `owner(String)`과 `balance(int)` 필드를 가진다.
- 단, `balance`는 `transient`로 선언한다.
- `writeObject()`와 `readObject()`를 오버라이드하여 `balance` 값도 파일에 함께 저장하고 복원되도록 작성하라.
- `Account("철수", 10000)`을 파일로 저장한 뒤 다시 읽어와 `owner`와 `balance`가 정상적으로 출력되는지 확인하라.
 */

import august.aug_0806_inheritance.abcdefExample.A;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Account implements Serializable{
    private static final long serialVersionUID = 1L;
    private String owner;
    private transient int balance;


    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        oos.writeInt(balance);
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        this.balance = ois.readInt();
    }
}

public class Prob4{

    public static void main(String[] args) throws Exception{
        String fileName = "prod4.dat";
        Account account = new Account("철수", 10000);

        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(account);

        oos.flush();
        oos.close();
        fos.flush();
        fos.close();

        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);

        try{
            Object obj = ois.readObject();
            System.out.println(obj);
        } catch (EOFException e){
            System.out.println("출력끝");
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        } finally {
            ois.close();
            fis.close();
        }


    }
}
