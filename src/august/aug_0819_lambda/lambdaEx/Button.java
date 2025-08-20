//package august.aug_0819_lambda.lambdaEx;
//
//public class Button {
//    public void setCLickListener(ClickListener clickListener){
//        this.clickListener = clickListener;
//    }
//    public void click(){
//        this.clickListener.onClick();
//    }
//
//    public static void main(String[] args) {
//        Button buttonOk = new Button();
//
//        buttonOk.setClickListener(
//            ()-> {
//                System.out.println("OK click");
//            }
//        );
//        buttonOk.click();
//
//        Button buttonCancel = new Button();
//        buttonCancel.setCLickListener(
//                ()->{
//                    System.out.println("취소");
//                }
//        );
//        for (int i = 0; i < 100; i++) {
//            buttonCancel.click();
//        }
//    }
//}
