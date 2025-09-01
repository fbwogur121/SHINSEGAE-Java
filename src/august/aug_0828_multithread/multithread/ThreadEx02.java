package august.aug_0828_multithread.multithread;


class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    // 동기화 메소드
    public synchronized void setMemory1(int memory) {
        this.memory = memory;
        synchronized (this) {

            try {
                Thread.sleep(2000); // 2초간 일시정지
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "Interrupted" + this.memory);
            }
        }
    }

    // 동기화 블럭을 포함하는 메서드
    public void setMemory2(int memory) {
        synchronized (this) {
            this.memory = memory;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "Interrupted" + this.memory);
            }
        }
    } // 동기화 블럭을 포함하는 메서드
}

class User1 extends Thread{
    private  Calculator calculator;

    public User1(){
        setName("User1의 Thread"); // 스레드의 이름 변경
    }

    public void setCalculator(Calculator calculator){
        this.calculator = calculator;
    }

    @Override
    public void run(){
        calculator.setMemory1(100); // 동기화 메소드 호출
    }

}
class User2 extends Thread{
    private  Calculator calculator;

    public User2(){
        setName("User2의 Thread"); // 스레드의 이름 변경
    }

    public void setCalculator(Calculator calculator){
        this.calculator = calculator;
    }

    @Override
    public void run(){
        calculator.setMemory1(200); // 동기화 메소드 호출
    }
}

// Calculator를 생성해서 User1과 User2에서 사용하도록 setCalculator() 메소드를 호출하고 두 스레드를 시작시키면 알아서 동작한다
public class ThreadEx02 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        User1 user1 = new User1();
        User2 user2 = new User2();

        user1.setCalculator(calculator);
        user2.setCalculator(calculator);

        System.out.println(calculator.getMemory());

        user1.start();

        System.out.println(calculator.getMemory());

        user2.start();

        System.out.println(calculator.getMemory());

    }
}
