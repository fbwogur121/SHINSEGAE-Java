package august.aug_0826_serialize;

// 자바는 메모리에 생성된 객체를 파일 또는 네트워크로 출력할 수 있다.
// 객체를 입출력 할 수 있는 보조 스트림
// ObjectInputStream(바이트 스트림과 연결되어 객체로 복원하는 역직렬화)
// ObjectOutputStream(바이트 스트림과 연결되어 객체를 직렬화)

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;
import java.util.Arrays;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
class User implements Serializable{
    private static final long serialVersionUID = 1L;
    private String name;
    private transient int age; // transient : 직렬화에서 제외됨.
    public static int count = 2; // static 필드도 직렬화에서 제외.
}


@Data
@AllArgsConstructor
@NoArgsConstructor
class Product implements Serializable{
    private static final long serialVersionUID = 1L;
    private String pname;
    private int price;
}

public class ObjectInOutEx {

    public static void main(String[] args) throws Exception{
        // 1. object.dat 에 파일객체 파일입력스트림 객체를 생성
        String fileName = "object.dat";

        FileOutputStream fos = new FileOutputStream(fileName);

        // 2. 생성된 파일입력스트림 객체에 객체출력스트림 객체를 연결.
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // 3. 객체 생성
        User user = new User("류재혁", 25);
        Product product = new Product("Mac", 2500000);
        int[] arr1 = {10, 20, 30};
        List<Product> products = Arrays.asList(product);

        // 4. 위 4개의 객체를 object.dat 파일에 저장
        oos.writeObject(user);
        oos.writeObject(product);
        oos.writeObject(arr1);
        oos.writeObject(products);

        // 5.
        oos.flush();
        oos.close();
        fos.flush();
        fos.close();

        // 6. 파일에서 읽어서 객체를 복원시켜주세요. ObjectInputStream
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);

//        try{
//           while(true){
//               Object obj = ois.readObject();
//               System.out.println(obj);
//           }
//        } catch(EOFException e){
//            System.out.println("파일 끝!");
//        } finally{
//            ois.close();
//            fis.close();
//        }

        User restoredUser = (User) ois.readObject();
        Product restoredProduct = (Product) ois.readObject();
        int[] restoredArr = (int[]) ois.readObject();
        List<Product> restoredList = (List<Product>) ois.readObject();

        System.out.println(restoredUser);
        System.out.println(restoredProduct);
        System.out.println(Arrays.toString(restoredArr));
        System.out.println(restoredList);

        ois.close();
        fis.close();
    }
}
