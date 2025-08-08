package assignment.stringTest.stringTest01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob2 {

    public static void main(String[] args) throws IOException {
        String inputStr;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("문자열을 입력하세요. : ");
        inputStr = br.readLine();

        StringBuilder res = new StringBuilder(inputStr);
        res.reverse();
        res.toString();

        System.out.println(res);
    }

}