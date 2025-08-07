//package assignment.inheritanceTest3;
//
//public class CheckingAccount extends Account {
//
//    private String cardNo;
//
//    public CheckingAccount(String accId, String ownerName, long balance, String cardNo){
//        super(accId, ownerName, balance);
//        setCardNo(cardNo);
//    }
//
//    public void pay(String cardNo, long amount){
//        if(!cardNo.equals(getCardNo())){
//            System.out.println("지불이 불그능합니다.");
//        }else{
//            super.withdraw(amount);
//        }
//    }
//
//
//
//    public void setCardNo(String cardNo){
//        this.cardNo = cardNo;
//    }
//    public String getCardNo(){
//        return this.cardNo;
//    }
//
//}
