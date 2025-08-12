package assignment.exceptionTest.assignment02;

public class CashPayment extends Payment{
    private String cashReceiptNumber; // 현금영수증번호

    public CashPayment(String shopName, String productName, long productPrice, String cashReceiptNumber) throws PayException {
        super(shopName, productName, productPrice);
        this.cashReceiptNumber = cashReceiptNumber;
    }

    public String toString(){
        return "";
    }

    @Override
    public void pay() throws PayException {
        System.out.println("현금이 정상적으로 지불되었습니다.");
        System.out.println("[ 현금 결제정보 ]");
        System.out.println("상점명 : " + getShopName());
        System.out.println("상품명 : " + getProductName());
        System.out.println("상품가격 : " + getProductPrice());
        System.out.println("현금영수증번호 : " + getCashReceiptNumber());
    }
    @Override
    public String getShopName() {
        return super.getShopName();
    }

    @Override
    public String getProductName() {
        return super.getProductName();
    }

    @Override
    public long getProductPrice() {
        return super.getProductPrice();
    }

    public String getCashReceiptNumber() {
        return cashReceiptNumber;
    }
}
