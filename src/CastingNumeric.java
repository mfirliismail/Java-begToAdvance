public class CastingNumeric {
    public static void main(String[] args) {
        

        byte byteValue = 3;
        short shortValue =38;
        int intValue = 20;
        long longValue = 923023;

        float floatValue = 923.5f;
        double doubleValue = 2341.44;

        System.out.println(Byte.MAX_VALUE);

        intValue = (int) longValue;

        System.out.println(intValue);

        intValue = (int) floatValue;
        System.out.println(intValue);
        String numString = "123";

        System.out.println(Integer.parseInt( "10"));
    }
}
