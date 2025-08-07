package assignment.inheritanceTest2.problem02;


public class BookMgr {

    private Book[] booklist;

    public BookMgr(Book[] booklist) {
        setBooklist(booklist);
    }

    public Book[] getBooklist() {
        return this.booklist;
    }

    public void setBooklist(Book[] booklist) {
        this.booklist = booklist;
    }

    public void printBooklist() {
        for (Book b : booklist) {
            System.out.println(b.getTitle());
        }
    }

    public void printTotalPrice() {
        int sum = 0;
        for (Book b : booklist) {
            sum += b.getPrice();
        }
        System.out.println("전체 책 가격의 합 : " + sum);
    }
}