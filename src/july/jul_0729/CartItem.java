package july.jul_0729;

public class CartItem {
    private String[] itemBook = new String[7];
    private String bookID;
    private int quantity;
    private int totalPrice;

    public CartItem(String[] book){
        this.itemBook = book;
        this.bookID = book[0];
    }
}
