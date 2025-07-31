package javabasic_02.test.loop_array;

public class JavaBasic3 {
    public static void main(String[] args) {
        while(true){
            int x = (int)(Math.random()*6)+1;
            int y = (int)(Math.random()*6)+1;

            System.out.printf("(%d, %d)\n",x,y);
            if(x+y == 5) break;
        }
    }
}
