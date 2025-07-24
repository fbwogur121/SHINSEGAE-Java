package July.Jul_0724;

public class PrimitiveAndStringConversionEx {
    public static void main(String[] args) {
        String v1 = "10";

        int d1 = Integer.parseInt(v1);
        System.out.println(d1 + 10);

        v1 = "3.14";
        double d2 = Double.parseDouble(v1);
        System.out.println(d2 + 0.01);

        v1 = "true";
        boolean d3 = Boolean.parseBoolean(v1);
        System.out.println(!d3);


    }
}
