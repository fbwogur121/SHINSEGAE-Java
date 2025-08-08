package assignment.stringTest.stringTest03;

public class Prob4 {
    public static void main(String[] args) {
        Prob4 p = new Prob4();
        String addr = "서울시,강남구,싹아트홀,신세계아이앤씨";
        String[] addrArr = p.split(addr, ',');
        System.out.println("배열 크기 : " + addrArr.length);
        for(int i=0; i<addrArr.length; i++){
            System.out.print(addrArr[i] + " ");
        }
    }

    public String[] split(String str, char separator){
        int count = 1;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == separator)
                count++;
        }
        String[] result = new String[count];
        int lastIndex = 0;
        int resultIndex = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == separator){
                result[resultIndex] = str.substring(lastIndex, i);
                lastIndex = i + 1;
                resultIndex++;
            }
        }
        result[resultIndex] = str.substring(lastIndex);
        return result;

    }
}
