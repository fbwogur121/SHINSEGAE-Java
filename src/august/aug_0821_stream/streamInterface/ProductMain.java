package august.aug_0821_stream.streamInterface;

import java.util.*;
import java.util.stream.Stream;

public class ProductMain {

    public static void main(String[] args) {
        // List<Product> products 생섣ㅇ
        List<Product> products = new ArrayList<>();
        products.add(new Product("1", "prod1", "cpny1", 100));
        products.add(new Product("2", "prod2", "cpny2", 200));
        products.add(new Product("3", "prod3", "cpny3", 300));
        products.add(new Product("4", "prod4", "cpny4", 400));
        products.add(new Product("5", "prod5", "cpny5", 500));

        Stream<Product> productStream = products.stream();

        //productStream.forEach(System.out::println);
        productStream.forEach(product -> System.out.println(product.toString()));

    }
}
