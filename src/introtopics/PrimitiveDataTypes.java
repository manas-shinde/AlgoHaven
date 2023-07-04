package introtopics;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
//        Data Types specify the different sizes and values that can be stored in variable.
//        Primitive -> boolean, byte, char, int, short, long, float, double

        /*
         * Boolean datatype:
         * Can store only one of two values 'true' or 'false'
         * Size 1 bit
         */
        boolean isVerified = true;
        System.out.println("valued in boolean variable : " + isVerified);

        /*
         * Byte datatype:
         * Can store integer values
         * Range:- -128 to 127
         * Size:- 1 byte
         */
        byte manasAge = 23;
        System.out.println("Manas age is " + manasAge);

        /*
         * Short datatype:
         * Can store more integer values
         * Range:- -32768 to 32767
         * Size:- 2 bytes
         */
        short airportArea = 600;
        System.out.println("Total area covered by Pune Airport is " + airportArea + " sq.m.");

        /*
         * Int datatype:
         * Can store all integer values
         * Range:- -2^31 to 2^31 - 1
         * Size:- 4 bytes
         */
        int maxIntValue = 2147483647;
        System.out.println("maximum value can be stored in 'int' is " + maxIntValue);

        /*
         * Long datatype:
         * Can store large integer values
         * Range:- -2^63 to 2^63 - 1
         * Size:- 8 bytes
         */
        long maxLongValue = Long.MAX_VALUE;
        long l = 3124455674L;
        System.out.println("Maximum value can be stored in long is " + maxLongValue);

        /*
         * Double datatype:
         * Can store floating point values with more precision values
         * Size:- 8 bytes
         * NOTE :   It should never be used for precision value such as Currency
         */
        double minDoubleValue = Double.MIN_VALUE;
        double d = 7227.89004D;
        System.out.println("Minimum value can be stored in double is " + minDoubleValue);

        /*
         * Float datatype:
         * Can store floating point(decimal numbers)
         * Size: 4 bytes
         */
        float maxFloatValue = Float.MAX_VALUE;
        float f = 62.79F;
        System.out.println("Maximum value can be stored in \"float\" is " + maxFloatValue);

        /*
         * Char datatype:
         * Can store single characters
         * Range:- 0 to '\uffff'
         * Size:- 2 bytes
         */
        char minCharValue = '\u0000';
        char maxCharValue = '\uffff';
        System.out.println(minCharValue + " " + maxCharValue);


    }
}
