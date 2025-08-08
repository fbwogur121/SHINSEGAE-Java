package assignment.stringTest.stringTest01;

public class Prob1 {

    public static void main(String args[]) {

        Prob1 prob1 = new Prob1();

        System.out.println( prob1.leftPad("SDS", 6, '#') );
        System.out.println( prob1.leftPad("SDS", 5, '$') );
        System.out.println( prob1.leftPad("SDS", 2, '&') );

    }

    public String leftPad(String str, int size, char padChar) {
        StringBuilder res = new StringBuilder(str);

        for (int i = str.length(); i < size; i++)
            res.insert(0, padChar);

        return res.toString();
    }

}