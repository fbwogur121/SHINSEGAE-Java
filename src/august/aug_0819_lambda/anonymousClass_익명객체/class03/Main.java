package august.aug_0819_lambda.anonymousClass_익명객체.class03;

class Animal{
    public String eat(){return "맛있게 먹습니다.";}
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal(){
            @Override
            public String eat(){
                run(); // - 안에서는 호출 가능
                return "강아지 멍멍" + run();
            }

            protected String run(){
                return "강아지 뛴다";
            }
        };

        String eat = dog.eat();
        System.out.println(eat);
        //dog.run(); -밖에서는 못부른다.
    }
}
