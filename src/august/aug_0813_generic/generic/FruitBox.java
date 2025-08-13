package august.aug_0813_generic.generic;

import august.aug_0806_inheritance.abcdefExample.A;

import java.util.ArrayList;
import java.util.List;

public class FruitBox<T>{
    List<T> fruits = new ArrayList<>();

    public void add(T fruit){
        fruits.add(fruit);
    }
}
