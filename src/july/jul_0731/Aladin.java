package july.jul_0731;

public class Aladin {
    public static void main(String[] args) {
        Book myFirstBook = new Book();
        myFirstBook.title = "전지적독자시점";
        myFirstBook.price = 20000;
        myFirstBook.company = "새회사";
        myFirstBook.author = "류재혁";
        myFirstBook.page = 220;
        myFirstBook.isbn = "12a939";

        System.out.println(myFirstBook);
        System.out.println(myFirstBook.title);
        //

        Book mySecondBook = new Book();
        mySecondBook.title = "견우와선녀";
        mySecondBook.price = 25000;
        mySecondBook.company = "새회사";
        mySecondBook.author = "안수민";
        mySecondBook.page = 250;
        mySecondBook.isbn = "12a938";

        System.out.println(mySecondBook);
        System.out.println(mySecondBook.title);

        Book[] fantasy = new Book[2];
        fantasy[0] = myFirstBook;
        fantasy[1] = mySecondBook;

        System.out.println(fantasy[1].title); // 주소에 의한 참조 > 간접접근

    }
}
