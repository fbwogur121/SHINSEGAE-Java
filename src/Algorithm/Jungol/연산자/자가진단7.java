package Algorithm.Jungol.연산자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 자가진단7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        boolean c = (a != 0);
        boolean d = (b != 0);

        boolean andResult = c && d;
        boolean orResult = c || d;

        System.out.println((andResult ? 1 : 0) + " " + (orResult ? 1 : 0));

        System.out.println(andResult + " " + orResult);
    }
}
