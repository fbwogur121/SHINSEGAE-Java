package assignment.stringTest_0808.stringTest03;

public class FindCharacters {
    public static void main(String[] args) {
        FindCharacters fc=new FindCharacters();
        int count=fc.countChar("Boys, be ambitious", 'b');
        System.out.println(count);

    }
    public int countChar(String str, char c) {
        int res = 0;
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            if(sb.charAt(i) == c) res++;
        }
        return res;
    }
}