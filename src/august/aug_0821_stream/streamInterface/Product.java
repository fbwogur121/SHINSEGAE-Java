package august.aug_0821_stream.streamInterface;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    // 제품은 제품번호, 제품이름, 제조사, 가격이라는 속성을 가지고 있다.
    private String no;
    private String name;
    private String company;
    private int price;

    @Override
    public String toString(){

        return "no: "+this.no+" | name: "+this.name+" | company: "+this.company+" | price: "+this.price;
    }
}
