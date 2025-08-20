package august.aug_0819_lambda.anonymousClass_익명객체.class01;

class Aniamal{
    public String eat() {
        return "맛있게 먹습니다.";
    }
}
class Dog extends Aniamal {
    @Override
    public String eat(){
        return "강아지가 맛있게 먹습니다.";
    }
}

public class Main {
    public static void main(String[] args) {
        Aniamal dog = new Dog();
        dog.eat();
    }
}
