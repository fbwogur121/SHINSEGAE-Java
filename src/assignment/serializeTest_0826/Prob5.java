package assignment.serializeTest_0826;

/*
아래 조건을 만족하는 `Product`와 `Order` 클래스를 작성하고, 직렬화/역직렬화 프로그램을 완성하라.

- `Product`: `name(String)`, `price(int)`
- `Order`: `orderId(int)`, `product(Product)`
- `Order` 객체를 생성하여 `order.dat`에 직렬화한다.
- 직렬화된 파일을 다시 읽어와 `Order` 객체 안에 있는 `Product` 정보까지 출력되도록 작성하라.
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Product implements Serializable{
    private static final long serialVersionUID = 1L;
    private String name;
    private int price;
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Order implements Serializable{
    private static final long serialVersionUID = 1L;
    private int orderId;
    private Product product;
}

public class Prob5 {
    public static void main(String[] args) throws Exception{
        String fileName = "prob5.dat";

        Order order1 = new Order(1, new Product("prod1", 100));
        Order order2 = new Order(2, new Product("prod2", 200));
        Order order3 = new Order(3, new Product("prod3", 300));

        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(order1);
        oos.writeObject(order2);
        oos.writeObject(order3);

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
            System.out.println("출력끝");
        } finally {
            ois.close();
            fis.close();
        }

    }
}
