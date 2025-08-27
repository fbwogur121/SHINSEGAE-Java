package assignment.exceptionTest_0812.assignment02;

public abstract class Payment implements Payable{
    protected String shopName;
    protected String productName;
    protected long productPrice;

    public Payment(String shopName, String productName, long productPrice) throws PayException{
        this.shopName = shopName;
        this.productName = productName;
        this.productPrice = productPrice;
        if(this.productPrice <= 0){
            throw new PayException("가격이 잘못되었습니다.");
        }
    }


    public String getShopName() {
        return shopName;
    }

    public String getProductName() {
        return productName;
    }

    public long getProductPrice() {
        return productPrice;
    }
}
