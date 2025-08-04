package july.jul_0801;

public class InternEx {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String(new char[]{'H','e','l','l','o'}).intern();

        System.out.println(str1 == str2);

        String str3 = new String("Hi");
        String str4 = "Hi";

        str3 = str3.intern();
        System.out.println(str4==str3);
    }
}
