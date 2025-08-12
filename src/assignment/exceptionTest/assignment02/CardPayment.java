package assignment.exceptionTest.assignment02;

public class CardPayment extends Payment{
    private String cardNumber; // 카드번호
    private String cardPassword; // 카드 비밀번호
    private int monthlyInstallment; // 할부개월

    public CardPayment(String shopName, String productName, long productPrice, String cardNumber, String cardPassword, int monthlyInstallment) throws PayException {
        super(shopName, productName, productPrice);
        this.cardNumber = cardNumber;
        this.cardPassword = cardPassword;
        this.monthlyInstallment = monthlyInstallment;
        if(this.monthlyInstallment < 0){
            throw new PayException("가격이나 할부개월수가 잘못되었습니다.");
        }
    }

    public String toString(){

        return "";
    }


    @Override
    public void pay() throws PayException {
        System.out.println("신용카드가 정상적으로 지불되었습니다.");
        System.out.println("[ 신용카드 결제정보 ]");
        System.out.println("상점명 : " + getShopName());
        System.out.println("상품명 : " + getProductName());
        System.out.println("상품가격 : " + getProductPrice());
        System.out.println("신용카드번호 : " + getCardNumber());
        System.out.println("할부개월 : " + getMonthlyInstallment());
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

    public String getCardNumber() {
        return cardNumber;
    }

    public int getMonthlyInstallment() {
        return monthlyInstallment;
    }
}
