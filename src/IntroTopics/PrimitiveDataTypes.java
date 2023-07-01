package IntroTopics;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
//        Data Types specify the different sizes and values that can be stored in variable.
//        Primitive -> boolean, byte, char, int, short, long, float, double

//        boolean (possible values - true/false)
        boolean isVerified = true;
        System.out.println("valued in boolean variable : " + isVerified);

//        byte (range is  -128 to 127 )
        byte manasAge = 23;
        System.out.println("Manas age is " + manasAge);

//        short (range is -32768 to 32767)
        short airportArea = 600;
        System.out.println("Total area covered by Pune Airport is " + airportArea + " sq.m.");

//        int (range is -2^31 to 2^31-1)
        int maxIntValue = 2147483647;
        System.out.println("maximum value can be stored in 'int' is " + maxIntValue);

//        long (-2^63 to 2^63-1)
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("Maximum value can be stored in long is " + maxLongValue);

//        double (precision 64-bit floating point number)
//        NOTE :   It should never be used for precision value such as Currency
        double minDoubleValue = Double.MIN_VALUE;
        System.out.println("Minimum value can be stored in double is " + minDoubleValue);

//        float (precision 32-bit floating point number)
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("Maximum value can be stored in \"float\" is " + maxFloatValue);

//        char (16-bit unicode characters)
        char minCharValue = '\u0000';
        char maxCharValue = '\uffff';
        System.out.println(minCharValue + "" + maxCharValue);


    }
}
