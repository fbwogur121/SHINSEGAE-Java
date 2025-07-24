package Algorithm.Jungol;

import java.util.Scanner;

public class jun_531 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float weight = sc.nextFloat();

        if(weight > 88.45){
            System.out.println("Heavyweight");
        }else if(weight > 72.57){
            System.out.println("Cruiserweight");
        }else if(weight > 61.23){
            System.out.println("Middleweight");
        }else if(weight > 50.80){
            System.out.println("Lightweight");
        }else {
            System.out.println("Flyweight");
        }
    }
}
